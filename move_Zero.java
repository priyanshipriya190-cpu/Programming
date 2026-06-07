import java.util.Arrays;
class main{
  public static void main (String args[]){
    int [] nums = {0,2,3,0,6};
    int j =0;
    for (int i =0; i<nums.length;i++){
      if (nums[i] != 0){
        nums[j] =nums[i];
        j++;
      }
    }
    while( j <nums.length){
      nums[j] =0;
      j++;
    }System.out.println(Arrays.toString(nums));
  }}
