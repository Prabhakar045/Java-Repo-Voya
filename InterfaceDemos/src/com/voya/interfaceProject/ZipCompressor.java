package com.voya.interfaceProject;

public class ZipCompressor implements ICompressor {
    @Override
    public String[] compresFiles(String file2, String file1) {

        String[] zippedFiles = new String[3];
        zippedFiles[0]="File 1";
        zippedFiles[1]="File 2";
        zippedFiles[2]="File 3";

        return zippedFiles;
    }
}
