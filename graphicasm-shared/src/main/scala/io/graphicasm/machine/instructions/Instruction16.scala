/*
 * Copyright 2014 Alejandro Sánchez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.graphicasm.machine.instructions

import io.graphicasm.machine.registers.{GeneralRegister, LowRegister}

/**
 * Parent of all 16 bit assembler instructions.
 */
trait Instruction16 extends Instruction

case class ADC(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class ADDIMMT1(rd: LowRegister, rn: LowRegister, imm: Imm3) extends Instruction16

case class ADDIMMT2(rdn: LowRegister, imm: Imm8) extends Instruction16

case class ADDREGT1(rd: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class ADDREGT2(rdn: GeneralRegister, rm: GeneralRegister, shift: Option[Shift] = None) extends Instruction16

case class ADDSPIMMT1(rd: LowRegister, imm: Imm8) extends Instruction16

case class ADDSPIMMT2(imm: Imm7) extends Instruction16

case class ADDSPREGT1(rdm: GeneralRegister, shift: Option[Shift] = None) extends Instruction16

case class ADDSPREGT2(rm: GeneralRegister, shift: Option[Shift] = None) extends Instruction16

case class ADR(rd: LowRegister, label: Either[String, Imm8]) extends Instruction16

case class AND(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class ASRIMM(rd: LowRegister, rm: LowRegister, imm: Imm5) extends Instruction16

case class ASRREG(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class BT1(cond: Condition, label: Either[String, Imm8]) extends Instruction16

case class BT2(label: Either[String, Imm11]) extends Instruction16

case class BIC(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class BKPT(imm: Imm8) extends Instruction16

case class BLX(rm: GeneralRegister) extends Instruction16

case class BX(rm: GeneralRegister) extends Instruction16

case class CMN(rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class CMPIMM(rn: LowRegister, imm: Imm8) extends Instruction16

case class CMPREGT1(rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class CMPREGT2(rn: GeneralRegister, rm: GeneralRegister, shift: Option[Shift] = None) extends Instruction16

case class CPS(mask: InterruptMask, imm: Imm1) extends Instruction16

case class CPYT1(rd: GeneralRegister, rm: GeneralRegister) extends Instruction16

case class CPYT2(rd: LowRegister, rm: LowRegister) extends Instruction16

case class EOR(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LDM(rn: LowRegister, registers: Set[LowRegister]) extends Instruction16

case class LDRIMMT1(rt: LowRegister, rn: LowRegister, imm: Imm5) extends Instruction16

case class LDRIMMT2(rt: LowRegister, imm: Imm8) extends Instruction16

case class LDRLIT(rt: LowRegister, label: Either[String, Imm8]) extends Instruction16

case class LDRREG(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LDRBIMM(rt: LowRegister, rn: LowRegister, imm: Imm5) extends Instruction16

case class LDRBREG(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LDRHIMM(rt: LowRegister, rn: LowRegister, imm: Imm5) extends Instruction16

case class LDRHREG(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LDRSB(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LDRSH(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LSLIMM(rd: LowRegister, rm: LowRegister, imm: Imm5) extends Instruction16

case class LSLREG(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class LSRIMM(rd: LowRegister, rm: LowRegister, imm: Imm5) extends Instruction16

case class LSRREG(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class MOVIMM(rd: LowRegister, imm: Imm8) extends Instruction16

case class MOVREGT1(rd: GeneralRegister, rm: GeneralRegister, shift: Option[Shift] = None) extends Instruction16

case class MOVREGT2(rd: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class MUL(rdm: LowRegister, rn: LowRegister) extends Instruction16

case class MVN(rd: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class NEG(rd: LowRegister, rn: LowRegister) extends Instruction16

case object NOP extends Instruction16

case class ORR(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

// Low registers and PC.
case class POP(registers: Set[GeneralRegister]) extends Instruction16

// Low registers and LR.
case class PUSH(registers: Set[GeneralRegister]) extends Instruction16

case class REV(rd: LowRegister, rm: LowRegister) extends Instruction16

case class REV16(rd: LowRegister, rm: LowRegister) extends Instruction16

case class REVSH(rd: LowRegister, rm: LowRegister) extends Instruction16

case class ROR(rdn: LowRegister, rm: LowRegister) extends Instruction16

case class RSB(rd: LowRegister, rn: LowRegister) extends Instruction16

case class SBC(rdn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case object SEV extends Instruction16

case class STM(rn: LowRegister, registers: Set[LowRegister]) extends Instruction16

case class STRIMMT1(rt: LowRegister, rn: LowRegister, imm: Imm5) extends Instruction16

case class STRIMMT2(rt: LowRegister, imm: Imm8) extends Instruction16

case class STRREG(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class STRBIMM(rt: LowRegister, rn: LowRegister, imm: Imm5) extends Instruction16

case class STRBREG(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class STRHIMM(rt: LowRegister, rn: LowRegister, imm: Imm5) extends Instruction16

case class STRHREG(rt: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class SUBIMMT1(rd: LowRegister, rn: LowRegister, imm: Imm3) extends Instruction16

case class SUBIMMT2(rdn: LowRegister, imm: Imm8) extends Instruction16

case class SUBREG(rd: LowRegister, rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class SUBSP(imm: Imm7) extends Instruction16

case class SVC(imm: Imm8) extends Instruction16

case class SXTB(rd: LowRegister, rm: LowRegister) extends Instruction16

case class SXTH(rd: LowRegister, rm: LowRegister) extends Instruction16

case class TST(rn: LowRegister, rm: LowRegister, shift: Option[Shift] = None) extends Instruction16

case class UDF(imm: Imm8) extends Instruction16

case class UXTB(rd: LowRegister, rm: LowRegister) extends Instruction16

case class UXTH(rd: LowRegister, rm: LowRegister) extends Instruction16

case object WFE extends Instruction16

case object WFI extends Instruction16

case object YIELD extends Instruction16
