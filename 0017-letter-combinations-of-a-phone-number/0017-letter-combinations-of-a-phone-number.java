class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.isEmpty()) return list;
        
        String[] arr = digits.split("");
        
        String[][] result = new String[arr.length][];
        int i = 0;
        for(String s : arr) {
            String[] temp = null;
            switch (s)
            {
                case "2":
                    temp = new String[]{"a","b","c"};
                    break;
                case "3":
                    temp = new String[]{"d","e","f"};
                    break;
                case "4":
                    temp = new String[]{"g","h","i"};
                    break;
                case "5":
                    temp = new String[]{"j","k","l"};
                    break;
                case "6":
                    temp = new String[]{"m","n","o"};
                    break;
                case "7":
                    temp = new String[]{"p","q","r", "s"};
                    break;
                case "8":
                    temp = new String[]{"t","u","v"};
                    break;
                case "9":
                    temp = new String[]{"w","x","y","z"};
                    break;
                default:
                    break;
            }
            result[i]=temp;
            i++;
        }
        
        find(result,list,0,0,arr.length,"");
        find(result,list,0,1,arr.length,"");
        find(result,list,0,2,arr.length,"");
        find(result,list,0,3,arr.length,"");
        
        return list;
    }
    
    void find(String[][] table, List<String> list, int depth, int index, int maxDepth, String value) {
        if(depth==maxDepth) {
            return;
        }
        
        String[] targets = table[depth];
        
        if(index==targets.length) return;
        value += targets[index];
        
        if(depth==maxDepth-1)list.add(value);
        find(table,list,depth+1,0,maxDepth,value);
        find(table,list,depth+1,1,maxDepth,value);
        find(table,list,depth+1,2,maxDepth,value);
        find(table,list,depth+1,3,maxDepth,value);
    }
}