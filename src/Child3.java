public class Child3 extends Parent {
    private double child3Field;

    public Child3(String parentField, double child3Field) {
        super(parentField);
        this.child3Field = child3Field;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child3 Field: " + child3Field);
    }
}