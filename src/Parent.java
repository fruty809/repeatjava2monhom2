public class Parent implements Printable {
    private String parentField;

    public Parent(String parentField) {
        this.parentField = parentField;
    }

    @Override
    public void print() {
        System.out.println("Parent Field: " + parentField);
    }
}