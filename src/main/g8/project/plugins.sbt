resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.bintrayIvyRepo("rtimush", "sbt-plugin-snapshots")
resolvers += Resolver.bintrayIvyRepo("lolhens", "sbt-plugins")
resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.jcenterRepo

sbtPlugin := true

addSbtPlugin("no.arktekk.sbt" % "aether-deploy" % "0.22.1")

addSbtPlugin("net.aichler" % "sbt-jupiter-interface" % "0.8.1")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.0")
