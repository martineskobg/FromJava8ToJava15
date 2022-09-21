package estafet.java17.sealed.classes;
// Every subclass of sealed class has to choose one of these three Options

// 1. Make it final (it cannot be extended)
// 2. Make it sealed (what can extend)
// 3. Make it non-sealed (can be extended)

public sealed class Human permits Man, Woman, Developer{
    //Java 17 Task 2
    @Override
    public String toString() {
        return "Human{}";
    }
}
