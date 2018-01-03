public class Rotate {
    public static void main(String[] args){
        int[][] test = {{1,2,3}, {4,5,6}, {7,8,9}};
        Solution obj = new Solution();
        obj.rotate(test);
        int[][] ans = {{7,4,1}, {8,5,2}, {9,6,3}};
        boolean correct = true;

        //Test algorithm
        for(int i = 0; i<ans.length; i++)
        {
            for(int j = 0; j<ans[0].length; j++) {
                if(ans[i][j] != test[i][j]) {
                    System.out.println("Error");
                    correct = false;
                    break;
                }
            }
        }
        //print matrix
        if(correct = true)
        {
            for(int i = 0; i<test.length; i++)
            {
                for(int j = 0; j<test[0].length; j++)
                {
                    System.out.print(test[i][j]);
                }
                System.out.println();
            }
        }
    }
}
