
public class Main
{
    public static void main(String[] args) {

        int [] list = {1,2,3,4,5,6};
        double sum=0.0;
        for (int i=0; i<list.length; i++){
            sum += (list[i]*list.length)/list[i]+1;
        }

        System.out.print(sum);
    }
}