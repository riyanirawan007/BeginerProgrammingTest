import java.util.ArrayList;

class Sequential{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        String[] nums=args[0].split(",");
        for(int i=0;i<nums.length;i++)
        {
            list.add(Integer.parseInt(nums[i]));
        }
        int findNum=Integer.parseInt(args[1]);

        System.out.println("Daftar data : "+list.toString());
        System.out.println("Data dicari : "+findNum);

        boolean isFound=false;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==findNum)
            {
                isFound=true;
                System.out.println("Data ditemukan diurutan : "+(i+1));
                break;
            }
        }

        if(!isFound) System.out.println("Data tidak ditemukan!");

    }
}