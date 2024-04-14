package com.remitly.json.verifier.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Statement {
    @SerializedName("Sid")
    private String sid;
    @SerializedName("Effect")
    private String effect;
    @SerializedName("Action")
    private List<String> listActions;
    @SerializedName("Resource")
    private String resource;
}
