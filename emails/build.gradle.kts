dependencies {
    implementation(project(":base"))

    implementation("org.jetbrains.exposed:exposed-spring-boot-starter:${Versions.EXPOSED}")
    implementation("org.jetbrains.exposed:exposed-dao:${Versions.EXPOSED}")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.postgresql:postgresql:42.3.1")

    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:3.0.4")
    implementation("org.springframework.amqp:spring-rabbit:2.4.2")
}