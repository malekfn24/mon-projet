pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/master']], // ou main, selon votre branche par défaut
                    userRemoteConfigs: [[url: 'https://github.com/malekfn24/tpfoyer.git']]
                ])
            }
        }
        // Ajoutez d'autres stages si nécessaire
    }
}
