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

import io.graphicasm.machine.registers.GeneralRegister

/** Parent of all assembler instructions. */
trait Instruction

/** Parent of all shift types. */
trait ShiftType

/** Logical shift left. */
case object LSL extends ShiftType

/** Logical shift right. */
case object LSR extends ShiftType

/** Arithmetic shift right. */
case object ASR extends ShiftType

/** Rotate right. */
case object ROR extends ShiftType

trait Shift {
  def shiftType: ShiftType
}

case class RegisterShift(shiftType: ShiftType, register: GeneralRegister) extends Shift

case class ImmediateShift(shiftType: ShiftType, imm: Imm5) extends Shift

case class Imm1(self: Int) extends AnyVal {
  def value: Int = self & 1
}

case class Imm3(self: Int) extends AnyVal {
  def value: Int = self & 7
}

case class Imm5(self: Int) extends AnyVal {
  def value: Int = self & 0x1F
}

case class Imm7(self: Int) extends AnyVal {
  def value: Int = self & 0x7F
}

case class Imm8(self: Int) extends AnyVal {
  def value: Int = self & 0xFF
}

case class Imm11(self: Int) extends AnyVal {
  def value: Int = self & 0x7FF
}

trait Condition {
  def value: Int
}

/** Equal. Z == 1. */
case object EQ extends Condition {
  val value = 0
}

/** Not equal. Z == 0. */
case object NE extends Condition {
  val value = 1
}

/** Carry set. C == 1. */
case object CS extends Condition {
  val value = 2
}

/** Carry clear. C == 0. */
case object CC extends Condition {
  val value = 3
}

/** Minus, negative. N == 1. */
case object MI extends Condition {
  val value = 4
}

/** Plus, positive or zero. N == 0. */
case object PL extends Condition {
  val value = 5
}

/** Overflow. V == 1. */
case object VS extends Condition {
  val value = 6
}

/** No overflow. V == 0. */
case object VC extends Condition {
  val value = 7
}

/** Unsigned higher. C == 1 and Z == 0. */
case object HI extends Condition {
  val value = 8
}

/** Unsigned lower or same. C == 0 and Z == 1. */
case object LS extends Condition {
  val value = 9
}

/** Signed greater than or equal. N == V. */
case object GE extends Condition {
  val value = 10
}

/** Signed less than. N != V. */
case object LT extends Condition {
  val value = 11
}

/** Signed greater than. Z == 0 and N == V. */
case object GT extends Condition {
  val value = 12
}

/** Signed less than or equal. Z == 1 and N != V. */
case object LE extends Condition {
  val value = 13
}

/** Always (unconditional). Any. */
case object AL extends Condition {
  val value = 14
}

/** Parent of all possible interrupt mask values. */
trait InterruptMask

/** Interrupt Enable. This sets PRIMASK.PM to 0. */
case object IE extends InterruptMask

/** Interrupt Disable. This sets PRIMASK.PM to 1. */
case object ID extends InterruptMask
