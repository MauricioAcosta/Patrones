/* Build the report about SE course*/
/*Adapted by HAD*/
public class ReportBuilderSE implements IReportBuilder{
      private Report report; 
	  public ReportBuilderSE(){
	    report = new Report();
	  }
	  @Override
	  public Report getReport(){   
	    return report;
	  }
	  @Override
	  public void buildContent() {
	    report.setContent("My first report with Builder design pattern about Software Engineering");
	  }
	  @Override
	  public void buildFooter() {
	    report.setFooter("MCIC-UDFJC");
	  }
	  @Override
	  public void buildHeader() {
	    report.setHeader("Mandatory course  of Software Engineering Emphasis");
	  }
	  @Override
	  public void buildPreface() {
	    report.setPreface("Report using Builder by : MCIC student");
	  }
	  @Override
	  public void buildReportTitle() {
	    report.setReportTitle("Software Engineering Report(1)");
	  }
}

