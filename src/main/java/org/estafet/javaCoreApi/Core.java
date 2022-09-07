package org.estafet.javaCoreApi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Core {

    /**
     * Create a list of numbers and populate it with random numbers
     *
     * @param listSize Integer
     * @return List of Integers
     */
    public List<Integer> creatListOfIntegers(int listSize, int min, int max) {

        List<Integer> myIntegerList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            int num = (int) Math.floor(Math.random() * (max - min + 1) + min);
            myIntegerList.add(num);
        }
        return myIntegerList;
    }

    /**
     * Get min of 2 doubles
     *
     * @param firstDouble  double
     * @param secondDouble double
     * @return min double
     */
    public double getMinOsTwoDoubles(double firstDouble, double secondDouble) {
        return Double.min(firstDouble, secondDouble);
    }

    /**
     * Get max of 2 doubles
     *
     * @param firstDouble  double
     * @param secondDouble double
     * @return max double
     */
    public double getMaxOsTwoDoubles(double firstDouble, double secondDouble) {
        return Double.max(firstDouble, secondDouble);
    }

    /**
     * Get the sum of 2 doubles
     *
     * @param firstDouble  double
     * @param secondDouble double
     * @return sum double
     */
    public double sumTwoDoubles(double firstDouble, double secondDouble) {
        return Double.sum(firstDouble, secondDouble);
    }

    //Print the content and the number of files of a zip archive
    public ZipFile getTheContentOfZip(String dir, String zipFileName) throws IOException {
        ZipFile zipFile = new ZipFile(dir);
       // ZipEntry zipEntry = zipFile.getEntry(zipFileName);
        return zipFile;

//        try(FileInputStream fis = new FileInputStream(zipFileName);
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            ZipInputStream zis = new ZipInputStream(bis)){
//
//            ZipEntry zipEntry;
//            while ((zipEntry = zis.getNextEntry()) != null){
//                zipFileNames.add(zipEntry.getName());
//
//            }

    }

}

