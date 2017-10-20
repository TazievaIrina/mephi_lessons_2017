/**
 * Created by Irishka on 17.10.2017.
 */

public class Function implements Functions {


    public double f ( double x, int t){
        switch (t) {
            case 1:  return Math.sin(x*x+2*x);
            case 2:  return Math.pow(x + 1, 3);
            case 3:  return Math.cos(x);
            case 4:  return Math.pow(x + 1, 2);
            case 5:  return Math.sin(x);
            case 6:  return Math.sin(Math.pow(x,2));
            case 7:  return Math.cos(3*x);
            case 8:  return Math.sin(x + 1);
            case 9:  return Math.pow(Math.cos(x),2);
            case 10: return Math.pow(x+1,3);

            default: return Math.pow(x, 2);
        }
    }
}