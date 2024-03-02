class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        
        String input = x+"";
        String output = "";
        
        for(int i=input.length()-1;i>=0;i--){
            output = output + input.charAt(i);
        }
        
        if(output.contains("-")){
            output = output.replace("-","");
            output = "-"+output;
        }
        
        Long outputValue = Long.valueOf(output);
        
        System.out.println(outputValue+"");
        
        
        if(outputValue > Integer.MAX_VALUE
          || outputValue < Integer.MIN_VALUE)
            return 0;
        
        return Integer.valueOf(output);
    }
}