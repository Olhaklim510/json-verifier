package com.remitly.json.verifier.service;

import com.google.gson.Gson;
import com.remitly.json.verifier.model.Policy;
import com.remitly.json.verifier.model.Statement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Verifier {

    public boolean isResourceValid(String filePath) {
        boolean isResourceValid = true;
        if (filePath == null) {
            throw new NullPointerException("Filepath can't be null!");
        }

        File file = new File(filePath);
        checkIfFileAvailable(file);

        Gson gson = new Gson();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            Policy policy = gson.fromJson(bufferedReader, Policy.class);
            for (Statement nextStatement : policy.getDocument().getListStatements()) {
                if (nextStatement.getResource().equals("*")) {
                    isResourceValid = false;
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return isResourceValid;
    }

    public void checkIfFileAvailable(File file) {
        if (!file.exists()) {
            throw new NullPointerException("File doesn't exist!");
        }
    }
}
