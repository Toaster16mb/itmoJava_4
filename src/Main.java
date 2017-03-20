public class Main {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList("Item1");
        int steps = rand(1, 10);
        for (int i = 0; i < steps; i++) {
            list1.add("radnom text for " + i + " = " + rand(-100, 100));
        }
        list1.printAll();
        System.out.println("List 1 size: " + list1.getSize());

        LinkedList list2 = new LinkedList();
        steps = rand(1, 10);
        for (int i = 0; i < steps; i++) {
            list2.add("radnom(list2) text for " + i + " = " + rand(-100, 100));
        }
        list2.printAll();
        System.out.println("List 2 size: " + list2.getSize());

        String testVal = list2.get(1);
        System.out.println("______________________________________");
        System.out.println(testVal);
        list2.set(1, "other");
        testVal = list2.get(1);
        System.out.println(testVal);
    }

    static public int rand(int rFrom, int rTo) {
        return rFrom + (int)(Math.random() * ((rTo - rFrom) + 1));
    }
}
