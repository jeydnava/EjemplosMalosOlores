package OOAbusers;

import java.util.ArrayList;
import java.util.List;

//Ejemplo de Temporary field
public class ReportGenerator {
    private List<String> dataLines; // Campo temporal
    private String reportTitle;    // Campo temporal
    private String footerText;     // Campo temporal

    public String generateMonthlySales(List<Sale> sales) {
        // Inicializa campos temporales
        this.dataLines = new ArrayList<>();
        this.reportTitle = "Monthly Sales Report";
        this.footerText = "End of Report";

        // Lógica para procesar las ventas y llenar dataLines
        for (Sale sale : sales) {
            dataLines.add(sale.getProduct() + " - " + sale.getAmount());
        }

        String report = formatReport(); // Usa los campos temporales
        // Los campos temporales quedan sin un estado claro después de este método
        this.dataLines = null;
        this.reportTitle = null;
        this.footerText = null;
        return report;
    }

    private String formatReport() {
        StringBuilder sb = new StringBuilder();
        sb.append(reportTitle).append("\n");
        for (String line : dataLines) {
            sb.append(line).append("\n");
        }
        sb.append(footerText);
        return sb.toString();
    }

    /*
     * Los campos dataLines, reportTitle y footerText son atributos de la clase ReportGenerator, pero solo se utilizan dentro 
     * del método generateMonthlySales y su método auxiliar formatReport. Se inicializan al principio del generateMonthlySales 
     * y se vuelven a poner a nulo al final. 
     */
}
