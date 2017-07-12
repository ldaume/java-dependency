Java Dependency
==========

# Abstract

An easy starting point for a java dependency as a [Giter8](http://www.foundweekends.org/giter8/) template which can be used with [sbt](http://www.scala-sbt.org/).

# Template Usage
`sbt new ldaume/java-dependency.g8 --name=java-dependency`

# Usage

The [SBT aether deploy plugin](https://github.com/arktekk/sbt-aether-deploy) is used to publish artifacts.

To deploy to remote Maven repository: 
`sbt aether-deploy`

To deploy to local maven repository:
`sbt aether-install`

# Usage if the publish/publish-local task is overriden
To deploy to remote Maven repository:
`sbt publish`

To deploy to local maven repository:
`sbt publish-local`


