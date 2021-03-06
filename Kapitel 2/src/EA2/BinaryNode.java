package EA2;

class BinaryNode {
    private BinaryNode leftSon, rightSon;
    private int value;

    public BinaryNode(int v) {
        value = v;
    }

    public boolean contains(int v) {
        if (v == this.value)
            return true;

        if (v < this.value)
            if (leftSon != null)
                return leftSon.contains(v);

        if (v > this.value)
            if (rightSon != null)
                return rightSon.contains(v);

        return false;
    }

    public void insert(int v) {
        if (v == this.value)
            System.out.println("DUPLICATE!");
        if (v < this.value) {
            if (this.leftSon == null) {
                this.leftSon = new BinaryNode(v);

            } else {
                this.leftSon.insert(v);
            }
        }

        if (v > this.value) {
            if (this.rightSon == null) {
                this.rightSon = new BinaryNode(v);

            } else {
                this.rightSon.insert(v);
            }
        }
    }

    public void inorder() {
        if (leftSon != null)
            leftSon.inorder();
        System.out.println(this.value);
        if (rightSon != null)
            rightSon.inorder();

    }
}
