class Solution {

   public static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<digits.length(); i++){
            fun(ans, digits.charAt(i));
        }
        return ans;
    }
    
   public static  ArrayList<String> fun( ArrayList<String> v, char c){
         String  num="";
         switch(c){
                  case '2': {num="abc"; break;}
                  case '3': {num="def"; break;}
                  case '4': {num="ghi" ;break;}
                  case '5': {num="jkl"; break;}
                  case '6': {num="mno" ;break;}
                  case '7': {num="pqrs" ;break;}
                  case '8': {num="tuv" ;break;}
                  case '9': {num="wxyz" ;break;}
         }
         
          ArrayList<String>  v2= new ArrayList<>();
         
         if(v.isEmpty()){
             for(int i=0; i<num.length(); i++){
                 v2.add(String.valueOf(num.charAt(i)));
             }
              v.addAll(v2);    
             return v;
         }
         
          
         for(int i=0; i<v.size(); i++){
             
             for(int j=0; j<num.length(); j++){
                 v2.add(String.valueOf(v.get(i)+num.charAt(j)));
                 
             }
             
         }
         v.clear();
          v.addAll(v2);  
       return v;
     }
};