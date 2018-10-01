package com.bignerdranch.android.criminalintent;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;
    private int picCounter;

    public Crime() {
        this(UUID.randomUUID(),0);

    }

    public Crime(UUID id,int piccounter) {
        mId = id;
        mDate = new Date();
        picCounter = piccounter;
    }
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public int getPicCounter(){
        return this.picCounter;
    }

    public int PicConuterAdd(){
        return this.picCounter+=1;
    }

    public void setPicCounter(int piccounter){picCounter=piccounter;}

    public String getPhotoFilename() {
        return "IMG_" + getId().toString()+this.picCounter%4+ ".jpg";
    }

    public ArrayList<String> getAllPhotoFilename(){

        int counter = 0;
        ArrayList filenames = new ArrayList<String>();
        if(this.getPicCounter()>=4){
            counter =3;
        }else {
            counter = this.getPicCounter();
        }
        for (int i = 0; i <=counter; i++) {
                filenames.add("IMG_" + getId().toString() + i + ".jpg");
            }
        return filenames;
    }
}
