public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxString = new MagicBox<String>(3);
        magicBoxString.add("Petya");
        magicBoxString.add("Anya");
        magicBoxString.add("Max");
        System.out.println(magicBoxString.pick());
        MagicBox<Integer> magicBoxInteger = new MagicBox<Integer>(3);
        magicBoxInteger.add(1);
        magicBoxInteger.add(2);
        magicBoxInteger.add(3);
        System.out.println(magicBoxInteger.pick());
    }
}