package SA4;

public class Tree {

    Object value;
    Tree[] children;
    
    public Tree(Object value, int children) {
        this.value = value;
        this.children = new Tree[children];
    }
    
    public static void main(String[] args) {
        Tree tree1 = new Tree(null, 2);
        Tree tree2 = new Tree(null, 2);
       
        tree2.children[0] = new Tree(tree2.children, 2);
        
        tree2.children[1] = new Tree(null, 1);
        tree2.children[1].value = tree2.children[1];
        tree2.children[1].children[0] = null;
    }
    
}
