package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f4 extends d21.a {
    public static final Parcelable.Creator<f4> CREATOR = new c21.c0(8);
    public long r;
    public byte[] s;
    public String t;
    public Bundle u;
    public int v;
    public long w;
    public String x;

    public f4(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.r = j;
        this.s = bArr;
        this.t = str;
        this.u = bundle;
        this.v = i;
        this.w = j2;
        this.x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 8);
        parcel.writeLong(this.r);
        byte[] bArr = this.s;
        if (bArr != null) {
            int Z2 = m7.y.Z(parcel, 2);
            parcel.writeByteArray(bArr);
            m7.y.a0(parcel, Z2);
        }
        m7.y.V(parcel, 3, this.t);
        m7.y.S(parcel, 4, this.u);
        m7.y.Y(parcel, 5, 4);
        parcel.writeInt(this.v);
        m7.y.Y(parcel, 6, 8);
        parcel.writeLong(this.w);
        m7.y.V(parcel, 7, this.x);
        m7.y.a0(parcel, Z);
    }
}
