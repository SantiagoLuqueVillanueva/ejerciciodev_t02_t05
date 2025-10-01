public class App {
    public static void main(String[] args) throws Exception {
        int pesetas = 10000;
        double conv = (int)(pesetas / 166.386);

        System.err.printf("%d pesetas son %f euros", pesetas, conv);
    }
}
