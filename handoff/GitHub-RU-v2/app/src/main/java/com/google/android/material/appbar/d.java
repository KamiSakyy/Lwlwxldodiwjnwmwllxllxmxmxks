package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends i5.b {
    public static final Parcelable.Creator<d> CREATOR = new c();
    public boolean t;
    public boolean u;
    public int v;
    public float w;
    public boolean x;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.v = parcel.readInt();
        this.w = parcel.readFloat();
        this.x = parcel.readByte() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.v);
        parcel.writeFloat(this.w);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
    }
}
