def download(repo){
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def build(){
sh 'maven package'
}
