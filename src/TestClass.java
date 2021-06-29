import java.util.function.BiPredicate;
public class TestClass {
    public static void main(String[] args){
        String s1="Ahmed";
        String s2="Wael";
        String longer = StringUtils.betterString(s1,s2, (s11, s12) -> s11.length() > s12.length());
        System.out.println("The output is:"+longer);
        String first = StringUtils.betterString(s1, s2, (s11, s12) -> false);
        System.out.println("The output is:"+first);
    }
}
