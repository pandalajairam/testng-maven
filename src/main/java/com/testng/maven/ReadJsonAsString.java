package com.testng.maven;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;

import io.restassured.path.json.JsonPath;

public class ReadJsonAsString {

	    public static void main(String[] args) throws Exception {/*
	        String file = "src/test/java/File.json";
	        Gson gson = new Gson();
	        JSONObject json = (JSONObject) readFileAsString(file);
	    */}
	    public static String readFileAsString(String file)throws Exception
	    {
	        return new String(Files.readAllBytes(Paths.get(file)));
	    }
	}