def buildNodeApp() {
  sh "npm install"
  sh "npm run build"
}
