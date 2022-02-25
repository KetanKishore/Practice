class Solution {
  public int compareVersion(String version1, String version2) {
        int p1 = 0;     //Pointer for characters in version1
        int p2 = 0;     //Pointer for characters in version2
        
        int res1 = 0;   //Num to be created everytime there is a dot in version1
        int res2 = 0;   //Num to be created everytime there is a dot in version2
        
        //Loop until one or both versions reached their length
        while(p1 < version1.length() || p2 < version2.length()){
            
            //Loop for res1
            while(p1 < version1.length() && version1.charAt(p1) != '.'){
                int num = Character.getNumericValue(version1.charAt(p1));
                res1 = res1*10 + num;
                p1++;
            }
            
            //Loop for res2
            while(p2 < version2.length() && version2.charAt(p2) != '.'){
                int num = Character.getNumericValue(version2.charAt(p2));
                res2 = res2*10 + num;
                p2++;
            }
            
            //Comparison
            if(res1 > res2){
                return 1;
            }
            else if(res1 < res2){
                return -1;
            }
            else{
                res1 = 0;
                res2 = 0;
                p1++;
                p2++;
            }
        }
        
        //If we reached here, it means both versions are the same
        return 0;
    }
}
