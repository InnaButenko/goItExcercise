package loops;

public class ArlanHelper {
    public String drawQuad(int n){

        int i = 0;
        while(i < n){
            int j = 0;
            while (j < n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        return "";
    }

    public String drawRect(int width, int height, char c){
        int row = 0;
        while (row < height){
            int col = 0;
            while (col < width){
                System.out.print(c);
                col++;
            }
            System.out.println();
            row++;
        }
        return "";
    }

    public String drawLine(int length) {
        StringBuilder result = new StringBuilder();

            int index = 0;
        while (index < length) {
            if (index % 2 == 0) {
                result.append("*");
            } else {
                result.append("#");
            }
            index++;
        }
            return result.toString();
        }

//    я написала это сама!!
    public String drawPattern(char[] pattern, int repeatCount){
        StringBuilder result = new StringBuilder();
        int num = 0;
        do {
        int index = 0;
        while (index < pattern.length){
            result.append(pattern[index]);
            index++;
        }
        num++;
    }while(num < repeatCount);
        return result.toString();
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));

        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));
    }
}
