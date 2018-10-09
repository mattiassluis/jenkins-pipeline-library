def call() {
  def cmd = 'git tag --sort=v:refname | tail -n 1'
  return sh(returnStdout: true, script: cmd).trim()
}
