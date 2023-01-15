node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/iconvport.git'), string(name: 'PORT_DESCRIPTION', value: 'conversion command and function for various encodings' )]
  }
}
