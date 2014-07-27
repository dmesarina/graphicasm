name := "Graphic Asm Project"

organization := "io.graphicasm"

lazy val commonSettings = Seq(
  scalaVersion := "2.11.2",
  resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

lazy val root = project.in(file(".")).aggregate()

lazy val graphicasmJS = project.in(file("graphicasm-js")).
  settings(commonSettings: _*).
  settings(scalaJSSettings: _*).
  settings(
    name := "graphicasm",
    unmanagedSourceDirectories in Compile +=
      (baseDirectory in root).value / "graphicasm-shared" / "src" / "main" / "scala",
    unmanagedSourceDirectories in Test +=
      (baseDirectory in root).value / "graphicasm-shared" / "src" / "test" / "scala"
  )

lazy val graphicasmJVM = project.in(file("graphicasm-jvm")).
  settings(commonSettings: _*).
  settings(
    name := "graphicasm",
    unmanagedSourceDirectories in Compile +=
      (baseDirectory in root).value / "graphicasm-shared" / "src" / "main" / "scala",
    unmanagedSourceDirectories in Test +=
      (baseDirectory in root).value / "graphicasm-shared" / "src" / "test" / "scala"
  )
