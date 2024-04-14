package com.remitly.json.verifier.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
public class Document {
    @SerializedName("Version")
    private String version;
    @SerializedName("Statement")
    private List<Statement> listStatements;
}
