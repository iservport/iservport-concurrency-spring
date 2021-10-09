// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"

name := "iservport-concurrency-spring"

organization := "com.iservport"

val springVersion = "2.5.2"
libraryDependencies ++= Seq(
  "org.springframework.boot" %  "spring-boot-starter-data-jpa" % springVersion,
  "org.springframework.boot" %  "spring-boot-starter-freemarker" % springVersion,
  "org.springframework.boot" %  "spring-boot-starter-security" % springVersion,
  "org.projectlombok" %  "lombok" % "1.18.12",
  "org.scalatest"     %% "scalatest"   % "3.1.0" % Test withSources()
)
