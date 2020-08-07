/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 30 16:40:56 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PdfName pdfName0 = PdfName.K;
      XYSeries xYSeries0 = new XYSeries(pdfName0, true, true);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      NumberAxis numberAxis0 = new NumberAxis("Null 'font' argument.");
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
