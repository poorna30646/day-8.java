import java.util.*;
class fire {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("matrix is:");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    int max=arr[0][0];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(arr[i][j]>max)
            max=arr[i][j];
        }
    }
    System.out.println("max element is:"+max);
  }
}