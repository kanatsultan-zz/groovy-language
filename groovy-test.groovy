#! groovy

// def nextBuildVersion(){
//     def latestGitTag = "git describe --abbrev=0 --tags".execute()
//     println "$latestGitTag"
// }
// nextBuildVersion

class nextBuildVersion { 
   static void sum(int a,int b = 5) { 
      int c = a+b; 
      println(c); 
   } 
	
   static void main(String[] args) {
      sum(6); 
   } 
}