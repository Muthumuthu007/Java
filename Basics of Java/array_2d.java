public class array_2d {
    public static void main(String[] args) {

      int  a[][]={{1,2,3,4},{5,7,8,9},{3,5,6,7}};
      int i,j;
      for(i=0;i<a.length;i++){
          for(j=0;j<a[0].length;j++){
              System.out.print(a[i][j]+" ");

          }
          System.out.println("");
      }
    }

}
