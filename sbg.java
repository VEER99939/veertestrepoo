
public class sbg {
public static void main(String[] args) {
   
    String s="69";
   int i=0,j=s.length()-1;
   boolean flag=true;
   while(i<j){
      char a=s.charAt(i);
      char b=s.charAt(j);
      if(a=='1'&&b=='1'){
        i++;
        j--;
      }else if(a=='8'&&b=='8'){
        i++;
        j--;
      }else if(a=='9'&&b=='6'){
        i++;
        j--;
      }else if(a=='6'&&b=='9'){
        i++;
        j--;
      }else if(a=='0'&&b=='0'){
        i++;
        j--;
      }else{
        flag=false;
        break;
      }
   }
   if(i==j){
    char mid=s.charAt(i);
    if(!(mid=='0'||mid=='1'||mid=='8')) flag=false;
   }
   if(flag) System.out.println("StroboGrammatic Number");
   else System.out.println("Not StroboGrammatic Number");
}
    
}