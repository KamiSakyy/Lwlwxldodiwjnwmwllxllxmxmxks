package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 extends d21.a {
    public static final Parcelable.Creator<c4> CREATOR = new c21.c0(7);
    public String r;
    public long s;
    public int t;

    public c4(int i, long j, String str) {
        this.r = str;
        this.s = j;
        this.t = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.V(parcel, 1, this.r);
        m7.y.Y(parcel, 2, 8);
        parcel.writeLong(this.s);
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(this.t);
        m7.y.a0(parcel, Z);
    }
}
