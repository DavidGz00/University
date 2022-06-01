package com.pmdm.university.entidad;

import java.util.List;

public class University {

    private List<String> webPages = null;

    private String name;

    public List<String> getWebPages() {

        return webPages;
    }

    public void setWebPages(List<String> webPages) {

        this.webPages = webPages;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
