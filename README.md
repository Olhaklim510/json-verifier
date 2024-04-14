# Json-verifier
The current version of this project is 1.0.

## Description
This is a Java implementation of the verifying the input JSON data. 
Input data format is defined as AWS::IAM::Role Policy - definition and example [AWS IAM Role JSON definition and example](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html)

### Details
#### Minimal Dependencies

This library has minimal dependencies to ensure there are no dependency conflicts when using it.

##### Required Dependencies

The following are the dependencies that will automatically be included when this library is included.

```xml
 <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.32</version>
</dependency>

<dependency>
<groupId>com.google.code.gson</groupId>
<artifactId>gson</artifactId>
<version>2.9.1</version>
</dependency>

<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<scope>test</scope>
</dependency>
```
##### Prerequisite

The library supports Java 17 and up. If you want to build from the source code, you need to install JDK 17 locally.

## Usage

### Validating inputs against a schema

The following example demonstrates how inputs are validated. It comprises the following steps.

* Create a file for reading using the file path.
* Use checkIfFileAvailable(File file) method of the Verifier to check if document exists.
* Read the data from the JSON document using BufferedReader.
* Creating a configuration for controlling validator behavior.
* Use isResourceValid(String filePath) method of the Verifier to validate the JSON document.

## Results and output formats

### Results

Library shall return logical false if an input JSON Resource field contains a single asterisk and true in any other case.

