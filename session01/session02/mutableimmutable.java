package session02;

public class mutableimmutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Hello")
                        .append(" to Dotin students");

        System.out.println(sb);

    }
}
