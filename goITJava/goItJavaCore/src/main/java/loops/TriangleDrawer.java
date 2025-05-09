package loops;

public class TriangleDrawer {
    public String drawTriangle(int side){
        StringBuilder triangle = new StringBuilder();
//        int rowcount = 0;
//        do {
//            int index = 0;
//            while (index <= rowcount) {
//                    triangle.append("*");
//                    index++;
//                }
//            triangle.append("\n");
//                rowcount++;
//            } while (rowcount < side) ;
        for (int i = side; i >= 1; i--){
            triangle.append("*".repeat(i)).append("\n");
        }
    return triangle.toString();
    }

    public String drawTriangle1(int side){
        StringBuilder triangle = new StringBuilder();
        int i = side;
        while(i >= 1){
            triangle.append("*".repeat(i)).append("\n");
            i--;
        }
        return triangle.toString();
    }

    public static void main(String[] args) {
        TriangleDrawer drawer = new TriangleDrawer();
    }

}
