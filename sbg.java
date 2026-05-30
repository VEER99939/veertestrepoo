import java.util.HashMap;
import java.util.Map;

public class sbg {
public static void main(String[] args) {
   
    String s="6699";
    Map<Character,Character> map=new HashMap<>();
    map.put('1','1');
    map.put('8', '8');
     map.put('0', '0');
      map.put('9', '6');
       map.put('6', '9');
    // for(int k=0;k<s.length();k++){
    //     char add=s.charAt(k);
    //     if(map.get())
    // }
   int i=0,j=s.length()-1;
   boolean flag=true;
   while(i<=j){
      char a=s.charAt(i);
      char b=s.charAt(j);
    if(map.containsKey(a)&&map.get(a)==b){
        i++;
        j--;
    }else{
        flag=false;
        break;
    }
   }
  
   if(flag) System.out.println("StroboGrammatic Number");
   else System.out.println("Not StroboGrammatic Number");
}
    
}