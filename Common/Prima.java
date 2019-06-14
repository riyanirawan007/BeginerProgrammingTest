import java.util.ArrayList;

class Prima {
    public static void main(String[] args){
        int start,finish;
        if(args.length>=2 && Integer.parseInt(args[0])+1>1 
        && Integer.parseInt(args[0])<=Integer.parseInt(args[1]))
        {

            start=Integer.parseInt(args[0]);
            finish=Integer.parseInt(args[1]);
            ArrayList<Integer> result=getPrima(start, finish);
            System.out.println("Terdapat "+result.size()+" Bilangan Prima dari "+start+" s/d "+finish+":");
            System.out.println(result.toString());;
        }
        else
        {
            System.out.println("Batas awal dan akhir bilangan prima tidak valid!");
        }
    }

    public static ArrayList<Integer> getPrima(int start, int finish){
        ArrayList<Integer> result=new ArrayList<>();
        boolean isPrima;
        for(int i=start;i<=finish;i++)
        {
            if(i>1)
            {
                isPrima=true;
                for(int j=2;j<=i-1;j++)
                {
                    if(i%j==0)
                    {
                        isPrima=false;
                    }
                }
                if(isPrima) result.add(i);
            }
        }
        return result;
    }
}
