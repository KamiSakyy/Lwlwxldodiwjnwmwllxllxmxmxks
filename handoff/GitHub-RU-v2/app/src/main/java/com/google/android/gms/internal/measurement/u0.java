package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 extends d21.a {
    public static final Parcelable.Creator<u0> CREATOR = new v0(0);
    public long r;
    public long s;
    public boolean t;
    public Bundle u;
    public String v;

    public u0(long j, long j2, boolean z, Bundle bundle, String str) {
        this.r = j;
        this.s = j2;
        this.t = z;
        this.u = bundle;
        this.v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 8);
        parcel.writeLong(this.r);
        m7.y.Y(parcel, 2, 8);
        parcel.writeLong(this.s);
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(this.t ? 1 : 0);
        m7.y.S(parcel, 7, this.u);
        m7.y.V(parcel, 8, this.v);
        m7.y.a0(parcel, Z);
    }
}
