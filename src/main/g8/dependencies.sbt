import net.aichler.jupiter.sbt.Import.JupiterKeys._
import sbt.Keys.libraryDependencies

libraryDependencies ++= Seq(

  // Commons
  "software.reinvent" % "commons" % "0.3.12",


  // TEST
  "org.assertj" % "assertj-core" % "3.11.1" % Test,
  "org.assertj" % "assertj-guava" % "3.2.0" % Test exclude("com.google.guava", "guava"),
  "net.javacrumbs.json-unit" % "json-unit" % "2.0.3" % Test,
  "net.javacrumbs.json-unit" % "json-unit-assertj" % "2.0.3" % Test,
  "net.aichler" % "jupiter-interface" % jupiterVersion.value % Test,
  "org.junit.jupiter" % "junit-jupiter-params" % junitJupiterVersion.value % Test,

  // mocking
  "org.powermock" % "powermock-module-junit4-common" % "2.0.0" % Test,
  "org.powermock" % "powermock-api-mockito2" % "2.0.0" % Test,
  "org.mockito" % "mockito-core" % "2.24.0" % Test
)

dependencyUpdatesFailBuild := true
