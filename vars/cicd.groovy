def gitdownload(reop)
{
   git "https://github.com/naveenjannu/${reop}.git"
}

def buildartifact()
{
   sh 'mvn package'
}
