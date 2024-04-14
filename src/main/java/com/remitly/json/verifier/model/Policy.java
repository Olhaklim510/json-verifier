package com.remitly.json.verifier.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
public class Policy {
    @SerializedName("PolicyName")
    private String name;
    @SerializedName("PolicyDocument")
    private Document document;
}
