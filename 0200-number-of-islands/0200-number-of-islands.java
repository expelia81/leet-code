class Solution {

	Set<String> set = new HashSet<>();
	int height;
	int width;
	char[][] input;
	int count = 0;

	public int numIslands(char[][] grid) {
		height = grid.length-1;  //3
		width = grid[0].length-1;  //4
		input = grid;

		for(int i=0; i<=height; i++) {

			for(int j=0; j<=width; j++) {
				String target = i+":"+j;
				if(set.contains(target)) {
					continue;

				} else {
					if(grid[i][j]=='1') {
						count++;
						isLand(i,j);
					} else {
						continue;
					}
				}
			}

		}


		return count;
	}

	public void isLand(int x, int y) {
//		System.out.println("x:"+x+", y:"+y);
        String target = ""+x+":"+y;
		set.add(target);
		//땅이아니면 재귀를 더 진행하지 않는다.
		if(input[x][y]=='0') return;

        int xp = x+1;
        int ym = y-1;
        int yp = y+1;
        int xm = x-1;
		// 땅이면서, 끝이 아니라면 한 칸씩 더 탐색한다.
        if(x<height && !set.contains(""+xp+":"+y)) {
            isLand(x+1,y);
        }
        if(y<width && !set.contains(""+x+":"+yp)){
            isLand(x,y+1);
        }
        if(y!=0 && !set.contains(""+x+":"+ym)){
            System.out.println(""+x+":"+ym);
            isLand(x,y-1);
        }
        if(x!=0 && !set.contains(""+xm+":"+y)){
            isLand(x-1,y);
        }
        // 		// 땅이면서, 끝이 아니라면 한 칸씩 더 탐색한다.
		// if(x<height) isLand(x+1,y);
		// if(y<width) isLand(x,y+1);
	}
}