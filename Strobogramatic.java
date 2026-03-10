public class Strobogramatic {
    StringBuilder s=new StringBuilder();
    for(char ch:str.toCharArray()){
        if(ch=='1'||ch=='0'||ch=='8'){
            s.append(ch);
        }
        if(ch=='6') s.append(9);
        
        else return false;
    }
    return str.equals(s.reverse().toString());
    
}
