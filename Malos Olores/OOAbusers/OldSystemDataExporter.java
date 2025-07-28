package OOAbusers;

import java.util.List;
import java.util.Map;

//Ejemplo de Alternative Classes with Different Interfaces
public class OldSystemDataExporter {
    public void exportToCSV(List<Map<String, String>> data) {
        // Lógica para exportar a CSV con formato antiguo
    }
    public void exportToXML(List<Map<String, String>> data) {
        // Lógica para exportar a XML con formato antiguo
    }
}

public class NewSystemDataExporter {
    public void writeCsvFile(List<String[]> records) {
        // Lógica para escribir CSV con nuevo formato
    }
    public void writeXmlDocument(List<Document> xmlNodes) {
        // Lógica para escribir XML con nuevo formato
    }
}

/*
 * Las clases OldSystemDataExporter y NewSystemDataExporter tienen el objetivo similar de exportar datos a diferentes formatos 
 * (CSV, XML). Sin embargo, sus métodos para realizar estas operaciones tienen nombres diferentes (exportToCSV vs writeCsvFile) y, 
 * lo que es más crítico, esperan tipos de datos de entrada diferentes (List<Map<String, String>> vs List<String[]>). 
 * Esto significa que no se puede tratar a estas clases de forma polimórfica (por ejemplo, pasándolas a un método que espera 
 * un "exportador de datos" genérico), y el código que utiliza ambas clases necesita lógica condicional para manejar sus interfaces 
 * distintas, dificultando el intercambio y la extensión.
 */