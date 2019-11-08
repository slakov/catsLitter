scalaVersion := "2.11.12"
libraryDependencies +=
  "org.typelevel" %% "cats-core" % "1.0.0"
scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ypartial-unification"
)
