package com.scp.DemoListner;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GenerateTestPieChart {

	public static void generateReportOfMyAppTestSuite(int passCount, int failCount, int skipCount){
		 DefaultPieDataset dataset = new DefaultPieDataset( );
	      dataset.setValue("Pass",new Double(passCount));
	      dataset.setValue("Fail", new Double(failCount));
	      dataset.setValue("skip", new Double(skipCount));
	      JFreeChart chart = ChartFactory.createPieChart("Test Case Report", dataset,true,true,false);
	      int width = 640; 
	      int height = 480;
	     File pieChart = new File("MyReport.jpeg"); 
	      try {
			ChartUtilities.saveChartAsJPEG(pieChart , chart , width , height);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("report not generated as there seems to be some problem....");
		}
	}
	
	
}	



