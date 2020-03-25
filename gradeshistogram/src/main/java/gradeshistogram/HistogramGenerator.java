package gradeshistogram;

import java.io.File;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class HistogramGenerator {

	public void generateChart(int[] dataValues) {

		XYSeriesCollection dataset = new XYSeriesCollection();

		XYSeries data = new XYSeries("random values");

		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}

		dataset.addSeries(data);

		boolean legend = false;
		boolean tooltips = false;
		boolean urls = false;

		JFreeChart chart = ChartFactory.createXYLineChart("Grades' Frequencies", "Grade", "Frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);

		ChartFrame frame = new ChartFrame("First", chart);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int result;
		File inFile = null;
		if (0 < args.length) {
			inFile = new File(args[0]);
		} else {
			System.err.println("Invalid arguments count:" + args.length);
			System.exit(0);
		}
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(inFile));
			while ((sCurrentLine = br.readLine()) != null) {
				result = Integer.parseInt(sCurrentLine);
				list.add(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		int[] frequencies = new int[11];
		for (int j = 0; j < frequencies.length; j++) {
			frequencies[j] = 0;
		}
		for (int i = 0; i < list.size(); i++) {
			frequencies[list.get(i)] += 1;
		}

		HistogramGenerator demo = new HistogramGenerator();
		demo.generateChart(frequencies);

	}
}
