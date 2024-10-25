public class SpiralMatrixPrint {
        public static void Spiral(int [][] Matrix){
            int StartingRow = 0;
            int StartingCol = 0;
            int EndingRow = Matrix.length - 1;
            int EndingCol = Matrix[0].length - 1;
            while (StartingCol <= EndingCol && StartingRow <= EndingRow) {
                //top
                for(int i = StartingCol; i <= EndingCol; i++){
                    System.out.print(Matrix[StartingRow][i] + " ");
                }
                StartingRow ++;
                //right
                for(int i = StartingRow; i <= EndingRow; i++){
                    System.out.print(Matrix[i][EndingCol] + " ");
                }
                EndingCol--;
                //bottom
                if(EndingRow > StartingRow){for(int i = EndingCol; i >= StartingCol; i--){
                    System.out.print(Matrix[EndingRow][i] +" ");
                }
                EndingRow--;}
                //left
                if(EndingRow > StartingRow){for(int i = EndingRow; i >= StartingRow; i--){
                    System.out.print(Matrix[i][StartingCol] +" ");
                }
                StartingCol++;}
            }
        }
        public static void main(String [] args){
        int matrix [] [] = {
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        Spiral(matrix);
    }
}
