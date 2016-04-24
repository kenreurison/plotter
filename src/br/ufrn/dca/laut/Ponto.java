/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.dca.laut;

import org.jfree.data.time.Millisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeriesDataItem;

/**
 *
 * @author kenreurison
 */
public class Ponto extends TimeSeriesDataItem {

    public Ponto(RegularTimePeriod t, Double value) {
        super(t, value);
    }

    public Ponto(Double value) {
        super(new Millisecond(), value);
    }

    @Override
    public String toString() {
        return "Ponto{" + "t=" + this.getPeriod() + ", d=" + this.getValue() + '}';
    }

    public static void main(String[] args) {
        Ponto p;
        for (int i = 0; i < 100000; i++) {
            p = new Ponto((double) i);
            System.out.println(p);
        }
    }
}
