package com.example.v040ff.sheep;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by cloud on 2017/09/24.
 */

public class Sheep extends RealmObject {
    @PrimaryKey
    private String num;


    private String mondai;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private String kaisetsu;
    private long id;


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMondai() {
        return mondai;
    }

    public void setMondai(String mondai) {
        this.mondai = mondai;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getKaisetsu() {
        return kaisetsu;
    }

    public void setKaisetsu(String kaisetsu) {
        this.kaisetsu = kaisetsu;
    }

}

