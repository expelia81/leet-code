class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> index0 = new ArrayList<>();
        index0.add(1);
        int index = 0;
        while(index <= rowIndex) {
            List<Integer> insert = new ArrayList<>();
            for(int i = 0;i<=index;i++) {
                if(i==0 || i==index) {
                    insert.add(1);
                } else {
                    List<Integer> pre = list.get(index-1);
                    insert.add(pre.get(i-1)+pre.get(i));
                }
            }
            list.add(insert);
            insert.forEach(integer -> System.out.print(integer));
            System.out.println(" "+insert.size());
            index++;
        }
        
        return list.get(rowIndex);
    }
    
}