package ch06.sec08;

public class PracticeMethod {

    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random (int x) {
        return (int)(Math.random()* x);
    }

    public int random(int z, int y) {
        return (int)(Math.random()* (y-z) ) + z;
    }
    public String getGrade(int score) {
        String aaa = "C";
        if (score > 90) {
            aaa = "A";
        } else if (score > 80) {
            aaa = "B";
        } return aaa;
    }

    public void printStar(int ccc) {
        for (int i = 0; i < ccc; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printStarTriangle(int star){
        for(int k=1; k<=star; k++) {
            printStar(k);

        // for(int z=0; z<star; z++){
           // for(int i=0; i<=z; i++) {
             //   System.out.print("*");
           // }
           // System.out.println();
            }
        }
    public void printStarRectangle(int star){
        for(int i=0; i<star; i++){
            printStar(star);
            }
        }
    public void gugudan(int num) {
        for(int i=1; i<10; i++){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }

    public void gugudan(int dan, int zzz){
        for(int i=dan; i<=zzz; i++) {
            gugudan(i);
        }
    }

    public int sum(int x, int y){
        int sum = 0;
        for(int i=x; i<=y; i++){
            sum += i;
        } return sum;
    }

}
