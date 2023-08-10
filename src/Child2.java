public class Child2 extends Parent {
    private int child2Field;

    public Child2(String parentField, int child2Field) {
        super(parentField);
        this.child2Field = child2Field;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child2 Field: " + child2Field);
    }
}