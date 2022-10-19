import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Reader {

    public static void main(String[] args) throws FileNotFoundException {
        Reader r = new Reader();
        System.out.println(r.getAtoTheRatio("src/Declaration"));
        System.out.println(r.getAtoTheRatio("src/tyson"));
        System.out.println(r.getAtoTheRatio("src/randj"));
        System.out.println(r.getAtoTheRatio("src/omam"));
        System.out.println(r.getAtoTheRatio("src/beemovie"));
        System.out.println(r.getAtoTheRatio("src/Minions"));
    }

    public String getAtoTheRatio(String fname) throws FileNotFoundException {
        double a=0;
        double the=0;
        File f = new File(fname);
        Scanner s = new Scanner(f);
        while(s.hasNext()) {
            String word = s.next();
            if(word.equals("a")) {
                a++;
            } else if(word.equals("the")) {
                the++;
            }
        }
        s.close();
        return fname + ": " + a*1.0/the;
    }
}
