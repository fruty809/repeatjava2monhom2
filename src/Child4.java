class Child4 extends Parent {
    private boolean child4Field;

    public Child4(String parentField, boolean child4Field) {
        super(parentField);
        this.child4Field = child4Field;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Child4 Field: " + child4Field);
    }
}