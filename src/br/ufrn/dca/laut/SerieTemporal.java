/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.dca.laut;

import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;

/**
 *
 * @author kenreurison
 */
public class SerieTemporal extends TimeSeries {

    public SerieTemporal(Comparable name, Class timePeriodClass) {
        super(name, timePeriodClass);
    }

    

    @Override
    public void add(TimeSeriesDataItem item) {
        super.add(item);
    }

    public static void main(String[] args) {
        SerieTemporal t = new SerieTemporal("", null);
    }
}
