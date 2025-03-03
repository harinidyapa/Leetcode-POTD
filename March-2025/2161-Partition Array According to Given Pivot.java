class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        ArrayList<Integer> arr4=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                arr1.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                arr3.add(nums[i]);
            }
            else
            {
                arr2.add(nums[i]);
            }
        }
        for(int i=0;i<arr1.size();i++)
        {
            arr4.add(arr1.get(i));
        }
        for(int i=0;i<arr2.size();i++)
        {
            arr4.add(arr2.get(i));
        }
        for(int i=0;i<arr3.size();i++)
        {
            arr4.add(arr3.get(i));
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<arr4.size();i++)
        {
            ans[i]=arr4.get(i);
        }
        return ans;
    }
}
