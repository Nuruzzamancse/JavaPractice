import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Array2DDemo {
    public static void main(String[] args){
        int[][] myArray= new int[12][8];

        int numRows = myArray.length;
        int numCols = myArray[0].length;

        for(int row=0; row<numRows;++row){
            for (int col=0;col<numCols;col++){
                myArray[row][col] = row*numCols + col +1 ;
            }
        }

        for (int row=0;row<numRows;row++)
        {
            for (int col=0;col<numCols;col++)
            {
                System.out.printf("%3d",myArray[row][col]);
            }

            System.out.println();
        }


    }
}
