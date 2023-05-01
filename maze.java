import java.util.Arrays;
public class maze {
   
    public static void main(String[] args) {
    //System.out.println(count(3,3));
    // pathdng("", 3,  3);
    boolean[][] board= {
        {true , true ,true},
        {true , true,true},
        {true , true ,true}
    };
    //pathall("", board, 0, 0);
    int[][] path = new int[board.length][board[0].length];
    pathallarray("", board, 0, 0, path, 1);
    

}

    static int count(int r , int c){
        if(r==1||c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }
    //This only returns the no of ways a maze can be cleared
    // now for printing paths

    static void path(String p , int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);

        }
    }

    static void pathdng(String p , int r , int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            pathdng(p+'D',r-1,c-1);
        }
        if(r>1){
            pathdng(p+'V',r-1,c);
        }
        if(c>1){
            pathdng(p+'H',r,c-1);

        }
    }

    static void pathobs(String p ,boolean[][] maze, int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]== false){
            return;
        }
        if(r<maze.length-1){
            pathobs(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathobs(p+'R',maze,r,c+1);

        }
    }

  
    static void pathall(String p ,boolean[][] maze, int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]== false){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            pathall(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathall(p+'R',maze,r,c+1);

        }
        if(r>0){
            pathall(p+'U', maze, r-1, c);
        }
        if(c>0){
            pathall(p, maze, r, c-1);
        }
        //This line is where my function ends
        // so before the function gets removed also remove the changes
        // by the function
        maze[r][c] =true;
    }

    static void pathallarray(String p ,boolean[][] maze, int r , int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step; 
            
            for (int[] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c]== false){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            pathallarray(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            pathallarray(p+'R',maze,r,c+1,path,step+1);

        }
        if(r>0){
            pathallarray(p+'U', maze, r-1, c,path,step+1);
        }
        if(c>0){
            pathallarray(p, maze, r, c-1,path,step+1);
        }
        //This line is where my function ends
        // so before the function gets removed also remove the changes
        // by the function
        maze[r][c] =true;
        path[r][c]=0;
    }




    

  





}
