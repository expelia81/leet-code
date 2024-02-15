class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> index0 = new ArrayList<>();
        index0.add(1);
        list.add(index0);
        int index = 2;
        while(index <= numRows) {
            List<Integer> insert = new ArrayList<>();
            for(int i = 0;i<index;i++) {
                if(i==0 || i==index-1) {
                    insert.add(1);
                } else {
                    List<Integer> pre = list.get(index-2);
                    insert.add(pre.get(i-1)+pre.get(i));
                }
            }
            list.add(insert);
            index++;
        }
        
        return list;
    }
}