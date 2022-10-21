def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh "mvn package"
}
/*
def newDeploy(job,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${job}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war
}
def git(repo)
{
  git "${repo}"
}
*/


