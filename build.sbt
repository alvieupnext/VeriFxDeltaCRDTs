ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "org.verifx" %% "verifx" % "1.0.1",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)


lazy val root = (project in file("."))
  .settings(
    name := "VerifxProject"
  )
