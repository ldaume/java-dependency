libraryDependencies ++= Seq(

  // Commons
  "software.reinvent" % "commons" % "0.3.9",


  // TEST
  "org.assertj" % "assertj-core" % "3.9.1" % "test",
  "org.assertj" % "assertj-guava" % "3.1.0" % "test" exclude("com.google.guava", "guava"),
  "com.novocode" % "junit-interface" % "0.11" % "test->default",
  "org.jukito" % "jukito" % "1.5" % "test"
)

dependencyUpdatesFailBuild := true
