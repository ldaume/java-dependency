resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.bintrayIvyRepo("rtimush", "sbt-plugin-snapshots")
resolvers += Resolver.bintrayIvyRepo("lolhens", "sbt-plugins")
resolvers += Resolver.sonatypeRepo("releases")
sbtPlugin := true

addSbtPlugin("no.arktekk.sbt" % "aether-deploy" % "0.21")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.5-5+g017b7e0")
