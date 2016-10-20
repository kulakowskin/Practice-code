
// Nicole Kulakowski
// Question 1.6
//
// Given an image represented by an NxN matrix, where each pixel in the image is
// 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
// place?

public class OnePointSix{

      int dim = 0;
      String matrix = "";
      String[][] rotate = new String[dim][dim];

      public static void main(String[] args){

            // 4x4 matrix
            String input = "****\n****\n****\n***0";
            OnePointSix OPS = new OnePointSix(input);
            //String[][] rotate = new String[dim][dim];
            OPS.solution(OPS.rotate, OPS.dim);
            System.out.println("Before:\n\n"+input);
            System.out.println("After:\n\n"+OPS.rotate);
      }

      public OnePointSix(String input){
            this.matrix = input;
            for(int i = 0; i<matrix.length(); i++){
                  if(matrix.charAt(i) == '\n'){
                        this.dim = i;
                        i = matrix.length();
                  }
            }
            rotate = createMatrix();
      }


      public String[][] createMatrix(){
            int row = 0;
            int col = 0;
            String[][] rotated = new String[dim][dim];
            for (int i = 0; i < matrix.length(); i++){
                  if(matrix.charAt(i) == '\n'){
                        row++;
                        col = 0;
                  }
                  rotated[col][row] = matrix.charAt(i);
                  col++;
            }

            return rotated;
      }


      public void solution(String[][] matrix, int n){
            for(int layer = 0; layer < n/2; ++layer){
                  int first = layer;
                  int last = n-1-layer;
                  for(int i = first; i<last;++i){
                        int offset = i-first;

                        //save top
                        String top = matrix[first][i];

                        //left -> top
                        matrix[first][i] = matrix[last-offset][first];

                        // bottom -> left
                        matrix[last-offset][first] = matrix[last][last-offset];

                        //right -> bottom
                        matrix[last][last-offset] = matrix[i][last];

                        //top -> right
                        matrix[i][last] = top;
                  }
            }
      }
}
