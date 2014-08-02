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

package io.graphicasm.machine.registers

/**
 * Parent of all special purpose registers.
 */
trait SpecialRegister extends Register

/**
 * The flags from previous instructions. System value 0.
 */
case object APSR extends SpecialRegister {
  val value = 0
}

/**
 * A composite from IPSR and APSR. System value 1.
 */
case object IAPSR extends SpecialRegister {
  val value = 1
}

/**
 * A composite from EPSR and APSR. System value 2.
 */
case object EAPSR extends SpecialRegister {
  val value = 2
}

/**
 * A composite of all three PSR registers. System value 3.
 */
case object XPSR extends SpecialRegister {
  val value = 3
}

/**
 * The Interrupt status register. System value 5.
 */
case object IPSR extends SpecialRegister {
  val value = 5
}

/**
 * The execution status register. System value 6.
 */
case object EPSR extends SpecialRegister {
  val value = 6
}

/**
 * A composite from IPSR and EPSR. System value 7.
 */
case object IEPSR extends SpecialRegister {
  val value = 7
}

/**
 * The Main Stack pointer. System value 8.
 */
case object MSP extends SpecialRegister {
  val value = 8
}

/**
 * The Process Stack pointer. System value 9.
 */
case object PSP extends SpecialRegister {
  val value = 9
}

/**
 * Register to mask out configurable exceptions. System value 16.
 */
case object PRIMASK extends SpecialRegister {
  val value = 16
}

/**
 * The CONTROL register. System value 20.
 */
case object CONTROL extends SpecialRegister {
  val value = 20
}
