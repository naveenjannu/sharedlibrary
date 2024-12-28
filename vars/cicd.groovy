def gitdownload(reop)
{
   git "https://github.com/naveenjannu/${reop}.git"
}

def buildartifact()
{
   sh 'mvn package'
}

def deploy()
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
