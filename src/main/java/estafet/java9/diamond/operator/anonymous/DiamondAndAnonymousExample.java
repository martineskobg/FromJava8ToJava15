package estafet.java9.diamond.operator.anonymous;

public class DiamondAndAnonymousExample {
    public static void main(String[] args){
        MyAnonymous<Integer> integerMyAnonymous = new MyAnonymous<>() {
            @Override
            Integer getParam(Integer param) {
                return param;
            }
        };


        MyAnonymous<String> stringMyAnonymous = new MyAnonymous<String>() {
            @Override
            String getParam(String param) {
                return param;
            }
        };
        System.out.println(integerMyAnonymous.getParam(100));
        System.out.println(stringMyAnonymous.getParam("Martin"));


    }

}
