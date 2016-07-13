name := "inteillij-slowdown-example"
version := "0.1"
scalaVersion := "2.11.8"

resolvers += Resolver.bintrayRepo("projectseptemberinc", "maven")

libraryDependencies := Seq(
  "com.projectseptember" %% "freek" % "0.4.3",
  "org.typelevel" %% "cats" % "0.5.0"
)

addCompilerPlugin("com.milessabin" % "si2712fix-plugin" % "1.2.0" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" %% "kind-projector"  % "0.7.1")

