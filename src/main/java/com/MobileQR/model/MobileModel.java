package com.MobileQR.model;

public class MobileModel
{


    private int pid;

    public MobileModel(int pid, String pname, int pqty) {
        this.pid = pid;
        this.pname = pname;
        this.pqty = pqty;
    }

    private String pname;
    private int pqty;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPqty() {
        return pqty;
    }

    public void setPqty(int pqty) {
        this.pqty = pqty;
    }
}

