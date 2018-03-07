// Project name (artifact name in Maven)
name := "$name$"
version := "$version$"
organization := "$organization$"

scalaVersion := "2.12.4"

// project description
description := "Template for a sbt/maven dependency."

scalacOptions in Test ++= Seq("-Yrangepos")
