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

object R1 extends LowRegister {
  val value = 1
}

object R2 extends LowRegister {
  val value = 2
}

object R3 extends LowRegister {
  val value = 3
}

object R4 extends LowRegister {
  val value = 4
}

object R5 extends LowRegister {
  val value = 5
}

object R6 extends LowRegister {
  val value = 6
}

object R7 extends LowRegister {
  val value = 7
}

object R8 extends HighRegister {
  val value = 8
}

object R9 extends HighRegister {
  val value = 9
}

object R10 extends HighRegister {
  val value = 10
}

object R11 extends HighRegister {
  val value = 11
}

object R12 extends HighRegister {
  val value = 12
}

object R13 extends HighRegister {
  val value = 13
}

object R14 extends HighRegister {
  val value = 14
}

object R15 extends HighRegister {
  val value = 15
}
