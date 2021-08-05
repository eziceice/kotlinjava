import java.util.Optional;

public class Compare {
    public Integer nullSafe(String str) {
        if (str != null) {
            return str.length();
        }
        if (Optional.of(str).isPresent()) {
            return str.length();
        }
        return 0;
    }

    public void strConcat(String str) {
        System.out.println("This is a str: " + str);
    }

    @Test
    public void test1With2With3With4(){
    }
}
