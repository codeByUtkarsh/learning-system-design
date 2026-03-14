package WithStrategyPattern;




public class PacificAtlanticWaterFlow {

}

class Solution {
    int n=0,m=0;
    int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
    public int countCoordinates(int[][] mat) {
        n = mat.length;
        m = mat[0].length;
        int[][] pacific = new int[n][m];
        int[][] atlantic = new int[n][m];
        int min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                canFlow(0,j,min,pacific,mat);
                canFlow(i,0,min,pacific,mat);
                canFlow(i,m-1,min,atlantic,mat);
                canFlow(n-1,j,min,atlantic,mat);
            }
        }
        int cnt =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j]==1 && atlantic[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void canFlow(int i,int j,int prev,int[][] vis,int[][] mat){
        if(i<0 || i>=n || j<0 || j>=n || mat[i][j]<prev || vis[i][j]==1) return;
        vis[i][j]=1;
        for(int[] d:dir){
            int nrow = i+d[0];
            int ncol = j+d[1];
            canFlow(nrow,ncol,mat[i][j],vis,mat);
        }
    }


}


