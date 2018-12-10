/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.DokterHelper;
import java.util.List;
import pojos.Dokter;

/**
 *
 * @author Ren
 */
public class test4 {
    public static void main(String[] args) {
        DokterHelper helper = new DokterHelper();
        List<Dokter> list = helper.getDokter();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getSpesialis());
        }
    }
}
