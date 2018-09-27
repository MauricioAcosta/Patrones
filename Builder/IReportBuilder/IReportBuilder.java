/**Ejemplo adaptado desde
 * https://dzone.com/articles/a-look-at-builder-pattern?edition=248583&utm_source=Daily%20Digest&utm_medium=email&utm_campaign=dd%202016-12-06
 * @author  Arun Pandey 
 * Adaptado por: Henry Diosa
 **/
public interface IReportBuilder {
	  public void buildPreface();
	  public void buildReportTitle();
	  public void buildHeader();
	  public void buildContent();
	  public void buildFooter();
	  public Report getReport();
}


