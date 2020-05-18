package com.example.android1mydz_list_15_05_2020;

import java.io.Serializable;

public class Students implements Serializable {
    private String et_add_name,et_add_surname,et_add_patronymic,et_add_group;

    public String getEt_add_name() {
        return et_add_name;
    }

    public void setEt_add_name(String et_add_name) {
        this.et_add_name = et_add_name;
    }

    public String getEt_add_surname() {
        return et_add_surname;
    }

    public void setEt_add_surname(String et_add_surname) {
        this.et_add_surname = et_add_surname;
    }

    public String getEt_add_patronymic() {
        return et_add_patronymic;
    }

    public void setEt_add_patronymic(String et_add_patronymic) {
        this.et_add_patronymic = et_add_patronymic;
    }

    public String getEt_add_group() {
        return et_add_group;
    }

    public void setEt_add_group(String et_add_group) {
        this.et_add_group = et_add_group;
    }

}

