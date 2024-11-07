public class problem3 {
    public static int removeElement (int[] a, int  val){
    int n = a.length;
    for( int i=0;i<n;)
        if ( a[i]==val){
            for( int j=i;j<=(n-2);j++){
                a[j]=a[j+1];
        }
        n--;
        }else{
            i++;
        }
        return n;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(removeElement( a, 0));
        System.out.println("DONE");
} 
}
