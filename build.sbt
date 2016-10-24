name := "Hello"

version := "1.0"

scalaVersion := "2.10.0"

resolvers +="Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.1.2"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"

scalacOptions += "-deprecation"

