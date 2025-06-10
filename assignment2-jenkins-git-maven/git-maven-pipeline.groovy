node {
    stage('Checkout from GitHub') {
        git branch: 'master',
            url: 'https://github.com/neeva2102/maven-jenkins-project.git'
    }

    stage('Build with Maven') {
        // Make sure Maven is configured as 'M3' in Jenkins
        withMaven(maven: 'M3') {
            sh 'mvn clean package'
        }
    }
}
