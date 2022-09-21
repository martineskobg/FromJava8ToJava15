package estafet.java17.pm_switch;

public class Main {
    public static void main(String[] args){
        System.out.println(patternMatchingSwitch(null));
        System.out.println(patternMatchingSwitch(15));
        System.out.println(patternMatchingSwitch(10L));
        System.out.println(patternMatchingSwitch(3.14));
        System.out.println(patternMatchingSwitch("Hello"));
        System.out.println(patternMatchingSwitch(new Object()));


    }

    static String patternMatchingSwitch(Object o){
        //Java 17 Task 1
        return switch (o){
            case null -> "We can pass null value to the switch";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }
}
