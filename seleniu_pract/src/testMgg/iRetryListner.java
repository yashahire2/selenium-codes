package testMgg;

import java.util.List;

import org.testng.IReporter;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.reporters.IReporterConfig;
import org.testng.xml.XmlSuite;

public class iRetryListner implements IRetryAnalyzer , IReporter {
	
	int counter  = 0;
	int retrylimit = 4;
	
	
	
  @Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		IReporter.super.generateReport(xmlSuites, suites, outputDirectory);
	}

	@Override
	public IReporterConfig getConfig() {
		// TODO Auto-generated method stub
		return IReporter.super.getConfig();
	}

@Test
  public void f() {
  }

@Override
public boolean retry(ITestResult result) {
	if(counter < retrylimit) {
		counter ++;
		return true;
		
	}
	
		return false;
	
}
}
