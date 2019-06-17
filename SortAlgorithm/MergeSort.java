class MergeSort{
    public static void main(String[] args){
        if(args.length>0)
        {
            String[] dataRaw=args[0].split(",");
            int[] data=new int[dataRaw.length];
            for(int i=0;i<dataRaw.length;i++){
                data[i]=Integer.valueOf(dataRaw[i]);
            }
            System.out.print("Data sebelum disorting: ");
            for(int val:data){System.out.print(val+",");}
            System.out.println();
            mergeSort(data);
            System.out.print("Data setelah disorting: ");
            for(int val:data){System.out.print(val+",");}
            System.out.println();
        }
        else
        {
            System.out.println("Input tidak valid");
        }
    }

    public static int[] mergeSort(int[] data)
    {
        int med=data.length%2==0?data.length/2;data.length+1/2;
        for(int i=0;i<data.length;i++)
        {
        }
        return data;
    }
}