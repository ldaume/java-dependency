libraryDependencies ++= Seq(

  // Commons
  "software.reinvent" % "commons" % "0.3.12",


  // TEST
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.junit.jupiter" % "junit-jupiter-api" % "5.3.1" % Test,
  "org.assertj" % "assertj-core" % "3.11.1" % Test,
  "org.assertj" % "assertj-guava" % "3.2.0" % Test exclude("com.google.guava", "guava"),
  "net.javacrumbs.json-unit" % "json-unit" % "2.0.3" % Test,
  "net.javacrumbs.json-unit" % "json-unit-assertj" % "2.0.3" % Test
)

dependencyUpdatesFailBuild := true
