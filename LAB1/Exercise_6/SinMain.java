package aa224iu__assign1.Exercise_6;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

public class SinMain {
	public static void main(String[]args) {
		
		XYChart chart = new XYChartBuilder().xAxisTitle("X").yAxisTitle("Y").width(800).height(600).build();
		
	    
	    
	    double [] xList = new double[2000];
	    xList[0] = 0;
		for (int i = 1; i < xList.length;i++) {
			xList[i] = xList[i-1] + ((Math.PI * 2) / xList.length);
		}
	    
	    double [] yList = new double [2000];
		for (int i = 0; i < yList.length;i++) {
			yList[i] = (1 + xList[i]/Math.PI) * Math.cos(xList[i]) * Math.cos(40*xList[i]);
		}
		chart.addSeries("the curve y the range 0 <= x <= 2*pi.", xList, yList);
		new SwingWrapper<>(chart).displayChart();
		

		
	}
	

}
