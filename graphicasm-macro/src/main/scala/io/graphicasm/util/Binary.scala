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

package io.graphicasm.util

import language.experimental.macros
import scala.collection.BitSet
import scala.reflect.macros.blackbox.Context

object Binary {
  def apply(ones: Int*) = macro applyImpl

  def applyImpl(c: Context)(ones: c.Expr[Int]*): c.Expr[Long] = {
    import c.universe._
    val positions = ones map (_.tree) map {
      case Literal(Constant(i: Int)) => i
    }
    val mask = BitSet(positions: _*).toBitMask.head
    c.Expr(Literal(Constant(mask)))
  }
}
