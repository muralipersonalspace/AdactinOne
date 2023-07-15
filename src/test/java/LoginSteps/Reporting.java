package LoginSteps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;










public class Reporting extends Libglobal {
	
	public static void generateJVMReport(String jsonfile) {
		
		//mention the report location 
		
		File reportdirectory = new File(getProjectPath()+"target");
		
		//set configuration
		
	Configuration configuration = new Configuration(reportdirectory, "AdactinApplication");
	
	configuration.addClassifications("platformName", "Windows");
	configuration.addClassifications("platformVersions", "10");
	configuration.addClassifications("buildNo", "FB9434");
	
	List<String>jsonfiles = new ArrayList<String>();
	jsonfiles.add(jsonfile);
	ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
	builder.generateReports();
	}
}
	
	
	
	
	
	
	
	
	
		
		
		
		

