public class game_of_life {
   
        int[][] dir = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        public void gameOfLife(int[][] board) {
           int m = board.length, n = board[0].length; 
    
           for(int i = 0;i<m;i++){
               for(int j = 0;j<n;j++){
                   int count = 0;
                   for(int[] di:dir){
                       //create the new row and column
                       int p = i+di[0];
                       int q = j+di[1];
    
                       //check for boundary conditions
                       if(p>=0 && p<m && q>=0 && q<n && (board[p][q]==1 ||board[p][q]==2)){
                           count++;
                       }
                   }
                   //alive->dead
                   if(board[i][j]==1){
                       if(count<2 || count>3){
                           board[i][j]=2;
                       }
                   }
                   //dead->alive
                   else{
                       if(count==3){
                           board[i][j]=3;
                       }
                   }
               }
           }
           for(int i = 0;i<m;i++){
               for(int j = 0;j<n;j++){
                   board[i][j]%=2;
               }
           }
        }
    }
