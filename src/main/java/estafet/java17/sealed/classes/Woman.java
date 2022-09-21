package estafet.java17.sealed.classes;

// Sealed class
public sealed class Woman extends Human permits WonderWoman  {
    @Override
    public String toString() {
        return "Human->Woman{}";
    }
}
