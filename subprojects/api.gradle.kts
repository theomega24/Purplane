import xyz.jpenilla.toothpick.loadDependencies
import xyz.jpenilla.toothpick.loadRepositories

repositories {
    loadRepositories(project)
}

dependencies {
    loadDependencies(project)
}

java {
    withJavadocJar()
}

publishing.repositories.maven {
    url = uri("https://repo.notom3ga.me/releases")
    credentials(PasswordCredentials::class)
}
