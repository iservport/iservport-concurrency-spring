import sbt._

object AppDependencies {

  val springVersion = "2.5.2"

  val compile = Seq(
    "org.springframework.boot" %  "spring-boot-starter-web"        % springVersion,
    "org.springframework.boot" %  "spring-boot-starter-data-jpa"   % springVersion,
    "org.springframework.boot" %  "spring-boot-starter-freemarker" % springVersion,
    "org.springframework.boot" %  "spring-boot-starter-security"   % springVersion,
    "org.projectlombok"        %  "lombok"                         % "1.18.12",
    "io.springfox"             %  "springfox-swagger-ui"           % "3.0.0",
    "io.swagger.core.v3"       %  "swagger-annotations"            % "2.1.11",
    "javax.persistence"        %  "javax.persistence-api"          % "2.2",
    "com.h2database"           %  "h2"                             % "1.4.200",
    "org.slf4j"                %  "slf4j-api"                      % "1.8.0-beta4",
    "org.slf4j"                %  "jul-to-slf4j"                   % "1.8.0-beta4",
    "org.slf4j"                %  "slf4j-log4j12"                  % "1.8.0-beta4"
  )

  val test = Seq(
    "org.scalatest"     %% "scalatest"   % "3.1.0" % Test withSources()
  )

  def apply(): Seq[ModuleID] = compile ++ test
}
