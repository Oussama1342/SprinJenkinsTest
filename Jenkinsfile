node {
 
 stage('Compile-Package'){
    sh 'mvn clean compile'

 }
 
 stage('Testing Stage'){
    sh 'mvn test'
 }
 stage('Deploy Stage'){
    sh 'mvn deploy'
 }
}
