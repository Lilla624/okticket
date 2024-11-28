/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Refactored: Varga Lilla, 2024-11-28
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Store {

  public static void writeIncidentToFile(Incident incident) {
    try {
      tryWriteIncidentToFile(incident);
    } catch (IOException e) {
      System.err.println("Hiba! A fájl írása sikertelen!");
      System.err.println(e.getMessage());
    }
  }
  public static void tryWriteIncidentToFile(Incident incident) throws IOException {
    FileWriter fw = new FileWriter("incidents.txt");
    fw.write(incident.name + ":" + incident.message + "\n");

    fw.close();
  }
}
