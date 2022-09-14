package org.estafet.java8.javaCoreApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

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


    /**
     * Get the content of zip file
     * @param dir string path to the zipped file
     * @return ZipFile
     * @throws IOException
     */
    public ZipFile getTheContentOfZip(String dir) throws IOException {
        return new ZipFile(dir);
    }

}

