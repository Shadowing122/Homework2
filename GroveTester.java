public class GroveTester {
    public static void main(String[] args) {
        Grove grove = new Grove("Grove 1");
        System.out.println(grove);
        for (int i = 0; i<7;i++){
            grove.planeTree(new Tree(i,37,"Spruce"));
        }
        System.out.println(grove);
        grove.removeTree(3);
        grove.removeTree(5);
        System.out.println(grove);
        grove.planeTree(new Tree(7,13,"Maple"));
        System.out.println(grove);
    }
}
