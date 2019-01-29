package aa224iu__assign1.Exercise_6;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;

public class Histogram {
	public static void main(String[] args) {

		try {
			readFile("C:\\Temp\\heltal.dat.txt");			
			PieChart chart = new PieChartBuilder().width(800).height(600)
					.title("Integers in the file").build();
			chart.addSeries(" 1 - 10", tal[0]);
			chart.addSeries("11 - 20", tal[1]);
			chart.addSeries("21 - 30", tal[2]);
			chart.addSeries("31 - 40", tal[3]);
			chart.addSeries("41 - 50", tal[4]);
			chart.addSeries("51 - 60", tal[5]);
			chart.addSeries("61 - 70", tal[6]);
			chart.addSeries("71 - 80", tal[7]);
			chart.addSeries("81 - 90", tal[8]);
			chart.addSeries("91 - 100", tal[9]);
			chart.addSeries("Others", ovriga );
			new SwingWrapper<PieChart>(chart).displayChart();
			
			CategoryChart barChart = new CategoryChartBuilder().width(800).height(600)
					.title("Integers in the file").xAxisTitle("Integers").yAxisTitle("Amount").build();
			barChart.getStyler().setLegendPosition(LegendPosition.InsideNW);
		    barChart.getStyler().setHasAnnotations(true);
		    
		    barChart.addSeries("Amount", Arrays.asList
		    		(new Integer[] { 1 - 10, 11 - 10, 21 - 30 , 31-40 , 41-50 , 51-60 , 61-70 , 71-80, 81-90 , 91-100 , })
		    		, Arrays.asList(new Integer[] { tal[0], tal[1], tal[2], tal[3] , tal[4] , tal[5] , tal[6], tal[7], tal[8],tal[9], }));
		
		    new SwingWrapper<CategoryChart>(barChart).displayChart();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	private static int ovriga = 0;
	private static int[] tal = new int[10];

	public static void readFile(String x) throws IOException {
		File file = new File(x);
		Scanner sc = new Scanner(file);
		int ovrig = 0;
		while (sc.hasNextInt()) {
			int scTal = sc.nextInt();
			if ((scTal > 100) || (scTal < 0)) 
				ovrig++;
			else {
				
				int n = ((scTal - 1) / 10);
				tal[n]++;
			}

		}
		
		ovriga = ovrig;
		sc.close();

	}

	
}
