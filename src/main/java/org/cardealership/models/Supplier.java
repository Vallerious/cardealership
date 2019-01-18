package org.cardealership.models;

import javax.persistence.Entity;

@Entity(name = "suppliers")
public class Supplier extends Identifiable {

    private String name;

    private boolean isImporter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsImporter() {
        return isImporter;
    }

    public void setIsImporter(boolean importer) {
        isImporter = importer;
    }
}
