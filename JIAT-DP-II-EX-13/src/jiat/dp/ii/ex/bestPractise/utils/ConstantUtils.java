/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jiat.dp.ii.ex.bestPractise.utils;

/**
 *
 * @author grays
 */
public class ConstantUtils {

    private static final String EMPTY_FEILD_ERROR = "Fileds are Empty Fill out and Try Again";
    private static final int DEFAULT_PASSWORD_LENGTH = 8;
    private static final String PASSWORD_LENGTH_ERROR = "Password Length is less than " + DEFAULT_PASSWORD_LENGTH + " charcters";

    public static String getEMPTY_FEILD_ERROR() {
        return EMPTY_FEILD_ERROR;
    }

    public static int getDEFAULT_PASSWORD_LENGTH() {
        return DEFAULT_PASSWORD_LENGTH;
    }

    public static String getPASSWORD_LENGTH_ERROR() {
        return PASSWORD_LENGTH_ERROR;
    }
}
