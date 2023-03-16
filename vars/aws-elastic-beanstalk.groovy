def deployToBeanstalk(appName, envName, versionLabel) {
  sh "eb use $envName"
  sh "eb deploy $versionLabel"
}
