package com.pmdm.university.interfaz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pmdm.university.entidad.University;

import java.util.List;

public class UniversityFetchResults {

    @SerializedName("results")
    @Expose
    private List<University> results;

    public List<University> getResults() {
        return results;
    }
}
