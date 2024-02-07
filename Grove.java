public class Grove {
    String groveName;
    Tree[] trees = new Tree[12];

    Grove(String name){
        this.groveName = name;
    }

    public int planeTree(Tree tree){
        int index = -1; // if this is returned the array is full
        for(int i = 0;i<this.trees.length;i++){
            if (this.trees[i] == null){
                this.trees[i] = tree;
                index = i;
                break;
            }
        }
        return index;
    }

    public Tree removeTree(int index){
        Tree tree = null;
        if(index < trees.length){
            tree = trees[index];
            trees[index] = null;
        } return tree;
    }

    public String toString(){
        int treeNumber = 0;
        for (int i = 0; i<this.trees.length; i++){
            if (this.trees[i] != null){
                treeNumber += 1;
            }
        }
        return ""+treeNumber;
    }
}
