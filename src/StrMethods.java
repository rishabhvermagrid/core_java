public class StrMethods {
    public static void main(String[] args){
                StringBuffer str = new StringBuffer("hey, rishabh pls logout");
                int start = str.indexOf("logout");
                int end = start + "logout".length();
                str.replace(start,end,"login");
                System.out.println(str);


        String st = "hey, rishabh pls logout, after logout come here";
        st  = st.replaceAll("logout","login");
        String str2 = st.substring(4);
        System.out.println(str2);

    }
    }

