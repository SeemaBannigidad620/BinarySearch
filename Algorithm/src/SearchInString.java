import com.sun.xml.internal.ws.util.StringUtils;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        searchInString(name, target);
    }

    private static void searchInString(String name, char target) {
        int length = name.length();
        for (int i = 0; i<length; i++){
            if(target == name.charAt(i)){
                System.out.println("target character is present in the given String " +name.charAt(i));
            }
        }
    }
}
