Java Dependency
==========

# Abstract

An easy starting point for a java dependency as a [template](https://www.lightbend.com/activator/template/java-dependency) which can be used with [Lightbend Activator](https://www.lightbend.com/activator/templates).

# Template Usage
`activator new PROJECTNAME java-dependency`

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
