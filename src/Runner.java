public class Runner {
    //warmup 1
    public boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)){
            return true;
        }else{
            return false;
        }
    }
    //warmup 2
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }
    //string 1
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    //string 2
    public boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            if((str.substring(i,i+1).equals("b")) && (str.substring(i+2,i+3).equals("b"))){
                return true;
            }
        }
        return false;
    }
    //string 3
    public int sumDigits(String str) {
        int sum = 0;
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                num = Integer.parseInt(str.substring(i,i+1));
                sum = sum + num;
            }
        }
        return sum;
    }
    //array 1
    public int sum2(int[] nums) {
        int sum = 0;
        if(nums.length < 2){
            for(int i = 0; i < nums.length; i++){
                sum+=nums[i];
            }
        }else{
            for(int i = 0; i < 2; i++){
                sum+=nums[i];
            }
        }
        return sum;
    }
    //array 2
    public int countEvens(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                sum+=1;
            }
        }
        return sum;
    }
    //array 3
    public int countClumps(int[] nums) {
        int numClumps = 0;
        if(nums.length == 0){
            numClumps = 0;
        }else{
            for(int i = 0; i < nums.length-2; i++){
                if(nums[i] == nums[i+1]){
                    if(nums[i] != nums[i+2]){
                        numClumps++;
                    }
                }
            }
            if(nums[nums.length-2]==nums[nums.length-1]){
                numClumps++;
            }
        }
        return numClumps;
    }
    //logic 1
    public boolean love6(int a, int b) {
        if(a==6 || b==6 || (a+b)==6 || Math.abs(a-b)==6){
            boolean result = true;
            return result;
        }else{
            boolean result = false;
            return result;
        }
    }
    //logic 2
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            sum = 0;
        }else{
            sum+=a;
            if(b == 13){
                sum = a;
            }else{
                sum+=b;
                if(c != 13){
                    sum+=c;
                }else{
                    sum = a+b;
                }
            }
        }
        return sum;
    }

}
