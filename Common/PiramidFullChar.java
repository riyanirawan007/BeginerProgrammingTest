import java.util.Scanner;

class PiramidFullChar {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Masukan tinggi : ");
        int h=scn.nextInt();
        //System.out.print("Masukan karakter :");
        String c="*";
        System.out.println("Hasil : ");
        System.out.print(draw(h,c));
        System.out.println("Hasil Reverse : ");
        System.out.print(drawReverse(h,c));
    }

    public static String draw(int height,String c){
        String result="";
        for(int i=0;i<height;i++)
        {
            for(int j=height;j>i;j--)
            {
                result+=" ";
            }
            for(int k=i;k>=0;k--)
            {
                result+=c;
            }
            for(int l=i-1;l>=0;l--)
            {
                result+=c;
            }
            result+="\n";
        }
        return result;
    }

    public static String drawReverse(int height,String c){
        String result="";
        for(int i=0;i<height;i++)
        {
            for(int j=i;j>=0;j--)
            {
                result+=" ";
            }
            for(int k=i;k<height-1;k++)
            {
                result+=c;
            }
            for(int l=i-1;l<height-1;l++)
            {
                result+=c;
            }
            result+="\n";
        }
        return result;
    }
}