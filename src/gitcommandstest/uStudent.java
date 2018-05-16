/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcommandstest;

/**
 *
 * Ctudent Object
 */
public class uStudent {

    /**
     * Student Id;
     */
    private int xId;

    /**
     * Student First Name
     */
    private String sFirstName;

    /**
     * Student Last Name
     */
    private String sLastName;

    /**
     * Class constructor with default attributes
     *
     * @param xId
     * @param sFirstName
     * @param sLastName
     */
    public uStudent(int xId, String sFirstName, String sLastName) {
        this.xId = xId;
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
    }

    /**
     * Default class constructor
     */
    public uStudent() {
    }

    public void AddNew() {
        System.out.println("");
        System.out.println("222");
    }

    /**
     * Student Id;
     *
     * @return the xId
     */
    public int getxId() {
        return xId;
    }

    /**
     * Student Id;
     *
     * @param xId the xId to set
     */
    public void setxId(int xId) {
        this.xId = xId;
    }

    /**
     * Student First Name
     *
     * @return the sFirstName
     */
    public String getsFirstName() {
        return sFirstName;
    }

    /**
     * Student First Name
     *
     * @param sFirstName the sFirstName to set
     */
    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    /**
     * Student Last Name
     *
     * @return the sLastName
     */
    public String getsLastName() {
        return sLastName;
    }

    /**
     * Student Last Name
     *
     * @param sLastName the sLastName to set
     */
    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

}
