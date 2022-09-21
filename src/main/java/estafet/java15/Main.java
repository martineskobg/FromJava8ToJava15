package estafet.java15;

public class Main {
    public static void main(String[] args) {
        String name = "Martin";
        String phoneNumber = "0883354224";
        String address = "Sofia, Mladost 3, 354";
        String salary = "6500BGN";

        // Formatted string using text blocks
        String info = """
                Name: %s
                Phone: %s
                Address: %s
                Salary: %s
                """.formatted(name, phoneNumber, address, salary);
        System.out.println(info);
    }
}
