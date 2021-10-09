import sbt._

object AppDependencies {

  val springVersion = "2.5.2"

  val compile = Seq(
    "org.springframework.boot" %  "spring-boot-starter-web"        % springVersion,
    "org.springframework.boot" %  "spring-boot-starter-data-jpa"   % springVersion,
    "org.springframework.boot" %  "spring-boot-starter-freemarker" % springVersion,
    "org.springframework.boot" %  "spring-boot-starter-security"   % springVersion,
    "org.projectlombok"        %  "lombok"                         % "1.18.12",
    "com.h2database"           %  "h2"                             % "1.4.200"
  )

  val test = Seq(
    "org.scalatest"     %% "scalatest"   % "3.1.0" % Test withSources()
  )

  def apply(): Seq[ModuleID] = compile ++ test
}
