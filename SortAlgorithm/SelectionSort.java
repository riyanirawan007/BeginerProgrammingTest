class SelectionSort{
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
            selectionSort(data);
            System.out.print("Data setelah disorting: ");
            for(int val:data){System.out.print(val+",");}
            System.out.println();
        }
        else
        {
            System.out.println("Input tidak valid");
        }
    }

    public static int[] selectionSort(int[] data){
        int index=0;
        int temp;
        for(int i=0;i<data.length;i++)
        {
            index=i;
            temp=data[i];
            for(int j=i+1;j<data.length;j++)
            {
                if(temp>data[j])
                {
                    temp=data[j];
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