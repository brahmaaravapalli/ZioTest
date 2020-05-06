name := """ziotest"""

organization := "com.pedrorijo91"
version := "1.0-SNAPSHOT"

//lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"
val zioVersion        = "1.0.0-RC16"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio-test"          % zioVersion % "test",
  "dev.zio" %% "zio-test-sbt"      % zioVersion % "test"
)

testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")