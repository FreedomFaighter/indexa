package com.usaa.mapper.cli;

import com.usaa.mapper.processors.Indexer;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        try {
            String directory = args[0];
            File inputDirectory = new File(directory.charAt(0) == '~' ? directory.substring(1) : directory);
	    if (inputDirectory != null && inputDirectory.isDirectory()) {
                Indexer.runIndexer(inputDirectory);
            } else {
                System.out.println("The directory given was not valid");
            }
        }
	catch (SecurityException se)
	{
		System.out.println("Security exception thrown by Manager.");
	}
	catch (Exception e) {
            e.printStackTrace();
        }
    }
}
