// Project name (artifact name in Maven)
name := "$name$"
version := "$version$"
organization := "$organization$"

scalaVersion := "2.12.8"

javacOptions ++= Seq("-source", "11", "-target", "11")

// project description
description := "Template for a sbt/maven dependency."

scalacOptions in Test ++= Seq("-Yrangepos")

testOptions += Tests.Argument(jupiterTestFramework, "-q", "-v")

parallelExecution in Test := true
