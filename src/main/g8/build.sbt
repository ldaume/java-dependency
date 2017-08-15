// Project name (artifact name in Maven)
name := "$name$"
version := "$version$"
organization := "$organization$"

scalaVersion := "2.12.3"

// project description
description := "Template for a sbt/maven dependency."

// Enables publishing to maven repo
publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "https://maven.reinvent-software.de/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "content/repositories/releases")
}

overridePublishBothSettings

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false


resolvers ++= Seq(
  Resolver.mavenLocal,
  "ReInvent Software OSS" at "https://maven.reinvent-software.de/nexus/content/groups/public"
)


libraryDependencies ++= Seq(

  // Commons
  "software.reinvent" % "commons" % "0.3.5",


  // TEST
  "org.assertj" % "assertj-core" % "3.8.0" % "test",
  "org.assertj" % "assertj-guava" % "3.1.0" % "test" exclude("com.google.guava", "guava"),
  "com.novocode" % "junit-interface" % "0.11" % "test->default",
  "org.jukito" % "jukito" % "1.5" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

dependencyUpdatesFailBuild := true

//dependencyUpdatesExclusions := moduleFilter(organization = "software.reinvent")
