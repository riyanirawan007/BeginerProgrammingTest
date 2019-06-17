class InsertionSort{
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
            insertionSort(data);
            System.out.print("Data setelah disorting: ");
            for(int val:data){System.out.print(val+",");}
            System.out.println();
        }
        else
        {
            System.out.println("Input tidak valid");
        }
    }

    public static int[] insertionSort(int[] data){
        int index=0;
        int temp;
        for(int i=1;i<data.length;i++)
        {
            temp=data[i];
            index=i;
            for(int j=i-1;j>=0;j--)
            {
                if(temp<data[j])
                {
                    index=j;
                }
            }

            if(index!=i)
            {
                temp=data[index];
                data[index]=data[i];
                data[i]=temp;                
            }

            for(int val:data){System.out.print(val+",");}
            System.out.println();
        }
        return data;
    }
}