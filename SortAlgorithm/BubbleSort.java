class BubbleSort{
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
            bubbleSort(data);
            System.out.print("Data setelah disorting: ");
            for(int val:data){System.out.print(val+",");}
            System.out.println();
        }
        else
        {
            System.out.println("Input tidak valid");
        }
    }

    public static int[] bubbleSort(int[] data){
        for(int i=0;i<data.length;i++)
        {
            for(int j=i+1;j<data.length;j++)
            {
                if(data[i]>data[j])
                {
                    int temp=data[j];
                    data[j]=data[i];
                    data[i]=temp;
                }
            }

            for(int val:data){System.out.print(val+",");}
            System.out.println();
        }
        return data;
    }
}