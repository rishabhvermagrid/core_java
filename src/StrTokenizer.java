import java.util.StringTokenizer;
public class StrTokenizer {
    public static void main(String[] args){
        String str = "Rishabh,25,Bombay";
        StringTokenizer st = new StringTokenizer(str,",");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
