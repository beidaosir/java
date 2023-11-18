package com.hnu.po;

import java.util.List;

public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;

    private List<Employee> empList;



    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    /**
     * 获取
     * @return deptno
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * 设置
     * @param deptno
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * 获取
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    /**
     * 获取
     * @return loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * 设置
     * @param loc
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }


    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public String toString() {
        return "Dept{deptno = " + deptno + ", dname = " + dname + ", loc = " + loc + "}";
    }
}
