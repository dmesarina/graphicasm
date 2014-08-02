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
 * Parent of all general purpose registers.
 */
trait GeneralRegister extends Register

/**
 * Parent of all low general purpose registers.
 */
trait LowRegister extends GeneralRegister

/**
 * Parent of all high general purpose registers.
 */
trait HighRegister extends GeneralRegister

case object R1 extends LowRegister {
  val value = 1
}

case object R2 extends LowRegister {
  val value = 2
}

case object R3 extends LowRegister {
  val value = 3
}

case object R4 extends LowRegister {
  val value = 4
}

case object R5 extends LowRegister {
  val value = 5
}

case object R6 extends LowRegister {
  val value = 6
}

case object R7 extends LowRegister {
  val value = 7
}

case object R8 extends HighRegister {
  val value = 8
}

case object R9 extends HighRegister {
  val value = 9
}

case object R10 extends HighRegister {
  val value = 10
}

case object R11 extends HighRegister {
  val value = 11
}

case object R12 extends HighRegister {
  val value = 12
}

case object R13 extends HighRegister {
  val value = 13
}

case object R14 extends HighRegister {
  val value = 14
}

case object R15 extends HighRegister {
  val value = 15
}
