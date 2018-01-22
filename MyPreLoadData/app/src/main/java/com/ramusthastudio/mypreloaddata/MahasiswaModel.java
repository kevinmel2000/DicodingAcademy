package com.ramusthastudio.mypreloaddata;

import android.os.Parcel;
import android.os.Parcelable;

public class MahasiswaModel implements Parcelable {
  private int id;
  private String name;
  private String nim;

  public MahasiswaModel(){  }

  public MahasiswaModel(String name,String nim){
    this.name = name;
    this.nim = nim;
  }

  public MahasiswaModel(int id,String name,String nim){
    this.id = id;
    this.name = name;
    this.nim = nim;
  }

  public int getId() { return id; }
  public String getName() { return name; }
  public String getNim() { return nim; }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(this.id);
    dest.writeString(this.name);
    dest.writeString(this.nim);
  }

  protected MahasiswaModel(Parcel in) {
    this.id = in.readInt();
    this.name = in.readString();
    this.nim = in.readString();
  }

  public static final Parcelable.Creator<MahasiswaModel> CREATOR = new Parcelable.Creator<MahasiswaModel>() {
    @Override
    public MahasiswaModel createFromParcel(Parcel source) {
      return new MahasiswaModel(source);
    }

    @Override
    public MahasiswaModel[] newArray(int size) {
      return new MahasiswaModel[size];
    }
  };
}
