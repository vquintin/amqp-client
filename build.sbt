name := "amqp-client"

organization := "com.github.sstone"
 
version := "1.6-MICS"
 
scalaVersion := "2.12.5"

crossScalaVersions := Seq("2.11.11", "2.12.5")


scalacOptions  ++=
  Seq("-feature",
      "-language:postfixOps",
      "-deprecation")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies := {
    val akkaVersion   = "2.5.11"
    Seq(
        "com.rabbitmq"         % "amqp-client"          % "3.5.7",
        "com.typesafe.akka"    %% "akka-actor"          % akkaVersion % "provided",
        "com.typesafe.akka"    %% "akka-slf4j"          % akkaVersion % "test",
        "com.typesafe.akka"    %% "akka-testkit"        % akkaVersion % "test",
        "org.scalatest"        %% "scalatest"           % "3.0.3" % "test",
        "ch.qos.logback"       %  "logback-classic"     % "1.1.2" % "test",
        "junit"           	   % "junit"                % "4.12" % "test"
    )
}
