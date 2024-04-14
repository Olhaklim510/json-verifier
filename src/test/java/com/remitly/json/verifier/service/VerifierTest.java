package com.remitly.json.verifier.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class VerifierTest {
    private static final String TEST_CASE1_JSON = "src/test/java/resources/case1.json";
    private static final String TEST_CASE2_JSON = "src/test/java/resources/case2.json";
    private static final String TEST_CASE3_JSON = "src/test/java/resources/case3.json";
    private static final String TEST_CASE4_JSON = null;

    @Test
    void testIsResourceValid() {
        boolean expectedCase1 = new Verifier().isResourceValid(TEST_CASE1_JSON);
        Assertions.assertFalse(expectedCase1);
        boolean expectedCase2 = new Verifier().isResourceValid(TEST_CASE2_JSON);
        Assertions.assertTrue(expectedCase2);
    }

    @Test
    void testCheckIfFileAvailable() {
        Assertions.assertThrows(NullPointerException.class, () -> new Verifier().checkIfFileAvailable(new File(TEST_CASE3_JSON)));
    }

    @Test
    void testCheckIfFilepathNotNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new Verifier().isResourceValid(TEST_CASE4_JSON));
    }
}