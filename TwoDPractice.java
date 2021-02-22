import java.io.* ;

class TwoDPractice
{
   
    /**
     * return the sum of all elements in the given row
     */
    public  int rowSum (int[][] data, int row) 
    {
      int add = 0;
      for(int i = 0; i < data[row].length;i++){
       add+= data[row][i];

      }
       System.out.println(add);
      return add;
     
    }

    /**
     * return the sum of all elements in the given column
     */
    public int columnSum(int[][] data, int col)
    {
      int add = 0;
      for(int i = 0; i < data.length;i++){
        if(data[i].length > col){
       add+= data[i][col];
        }
      }
       System.out.println(add);
      return add;
    }
}      
