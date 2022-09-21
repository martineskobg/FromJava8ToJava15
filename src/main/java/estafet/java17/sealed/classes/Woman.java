package estafet.java17.sealed.classes;

// Sealed class
public sealed class Woman extends Human permits WonderWoman  {
    //Java 17 Task 2
    @Override
    public String toString() {
        return "Human->Woman{}";
    }
}
