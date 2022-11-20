def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeployment(job,ip,context)
{
  sh "scp /root/.jenkins/workspace/${job}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
 def runSelenium(job)
{
  sh "java -jar /root/.jenkins/workspace/${job}/testing.jar"
}
