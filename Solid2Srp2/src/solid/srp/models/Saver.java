package src.solid.srp.models;

import java.io.FileWriter;
import java.io.IOException;

public class Saver implements Savable{
    private String filename;
    private solid.srp.models.Order order;

    public Saver(String filename, solid.srp.models.Order order){
        this.filename = filename;
        this.order = order;
    }
    @Override
    public void savaToJson() {

        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
