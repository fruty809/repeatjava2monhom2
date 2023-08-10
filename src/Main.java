public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];

        objects[0] = createObject("2й", "Parent Value 1", 42);
        objects[1] = createObject("3й", "Parent Value 2", 3.14);
        objects[2] = createObject("4й", "Parent Value 3", true);

        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static Printable createObject(String className, String parentField, Object childField) {
        Printable object = null;

        switch (className) {
            case "2й":
                object = new Child2(parentField, (int) childField);
                break;
            case "3й":
                object = new Child3(parentField, (double) childField);
                break;
            case "4й":
                object = new Child4(parentField, (boolean) childField);
                break;
            default:
                System.out.println("Unknown class name");
        }

        return object;
    }
}






