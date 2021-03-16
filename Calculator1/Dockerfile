FROM ubuntu:latest

RUN apt-get update && apt install openjdk-8-jdk -y

MAINTAINER Rajnish_Shonkhia

WORKDIR /usr/local

ADD /var/lib/jenkins/workspace/Calculatorpipeline/Spe-miniproject/Calculator1/target/calculator1-1.0-SNAPSHOT.jar .

