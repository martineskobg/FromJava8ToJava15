package estafet.java9.diamond.operator.anonymous;

public class DiamondAndAnonymousExample {
    public static void main(String[] args){
        // We can create different implementations of the MyAnonymous class
        MyAnonymous<Integer> integerMyAnonymous = new MyAnonymous<>() {
            @Override
            Integer getParam(Integer param) {
                return param;
            }
        };
        MyAnonymous<String> stringMyAnonymous = new MyAnonymous<>() {
            @Override
            String getParam(String param) {
                return param;
            }
        };

        System.out.println(integerMyAnonymous.getParam(100));
        System.out.println(stringMyAnonymous.getParam("Martin"));
    }
}
