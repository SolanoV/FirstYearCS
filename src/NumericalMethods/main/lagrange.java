package NumericalMethods.main;

import java.util.Scanner;
import java.text.*;

public class lagrange {
    public void lagrangemain() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("##,###.00");
        dialogues dg=new dialogues();

        dg.drawString("Enter the number of data points: ");
        int n=scanner.nextInt();

        double[] xValues=new double[n];
        double[] yValues=new double[n];

        for (int i=0; i<n; i++) {
            dg.drawString("Enter the value of x" + (i+1) + ": ");
            xValues[i] = scanner.nextDouble();
            dg.drawString("Enter the value of y" + (i+1) + ": ");
            yValues[i] = scanner.nextDouble();
        }

        dg.drawString("Enter the value of x for interpolation: ");
        double xInterpolated=scanner.nextDouble();
        double yInterpolated=lagrangeInterpolation(xValues, yValues, xInterpolated);
        dg.drawString("Interpolated value of y: "+df.format(yInterpolated));

    }
    public static double lagrangeInterpolation(double[] xValues, double[] yValues, double xInterpolated) {
        double interpolatedValue=0;

        for (int i=0; i<xValues.length; i++){
            double term=yValues[i];
            for (int j=0; j<xValues.length; j++){
                if (i!=j){
                    term*=(xInterpolated - xValues[j]) / (xValues[i] - xValues[j]);
                }
            }
            interpolatedValue+=term;
        }

        return interpolatedValue;
    }
}
