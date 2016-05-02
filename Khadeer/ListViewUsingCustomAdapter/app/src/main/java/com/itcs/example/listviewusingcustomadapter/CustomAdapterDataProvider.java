package com.itcs.example.listviewusingcustomadapter;

/**
 * Created by khussain on 5/2/2016.
 */
public class CustomAdapterDataProvider {
    private int image_resources;
    private  String Fname;
    private  String Lname;
    private  String Native;

    public CustomAdapterDataProvider(String Fname, String Lname, String Native,int image_resources)
    {
        this.setImage_resources(image_resources);
        this.setFname(Fname);
        this.setLname(Lname);
        this.setNative(Native);


    }

    public String getNative() {
        return Native;
    }

    public void setNative(String aNative) {
        Native = aNative;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public int getImage_resources() {
        return image_resources;
    }

    public void setImage_resources(int image_resources) {
        this.image_resources = image_resources;
    }
}
