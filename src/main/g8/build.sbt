name := """$name$"""

version := "$version$"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "$scalatestplay_version$" % Test
)