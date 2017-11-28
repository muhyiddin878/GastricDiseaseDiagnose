package com.example.muhyiddin878.gastricdiseasediagnosis;

import android.widget.TextView;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by muhyiddin878 on 11/21/17.
 */
public class KuisionerActivityTest {

    int load = 0;
    TextView quest;
    Soal soal[] = KuisionerActivity.soal;
    @Test
    public void setSoal() throws Exception {
        quest.setText(soal[load].getSoal());
    }

}