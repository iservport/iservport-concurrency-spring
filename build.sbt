import sbt._

organization := "com.iservport"

ThisBuild / scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .dependsOn(concurrencyProject)
  .settings(
    name := "iservport-concurrency-spring",
    Compile / mainClass := Some("com.iservport.concurrency.Application"),
    libraryDependencies ++= AppDependencies()
  )

lazy val concurrencyProject = ProjectRef(uri("ssh://git@github.com/iservport/iservport-concurrency.git"), "iservport-concurrency")