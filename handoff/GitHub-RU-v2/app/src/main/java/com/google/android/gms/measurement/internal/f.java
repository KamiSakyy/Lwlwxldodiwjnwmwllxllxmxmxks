package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends d21.a {
    public static final Parcelable.Creator<f> CREATOR = new c21.c0(3);
    public long A;
    public w B;
    public String r;
    public String s;
    public q4 t;
    public long u;
    public boolean v;
    public String w;
    public w x;
    public long y;
    public w z;

    public f(f fVar) {
        c21.uShadow.g(fVar);
        this.r = fVar.r;
        this.s = fVar.s;
        this.t = fVar.t;
        this.u = fVar.u;
        this.v = fVar.v;
        this.w = fVar.w;
        this.x = fVar.x;
        this.y = fVar.y;
        this.z = fVar.z;
        this.A = fVar.A;
        this.B = fVar.B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.V(parcel, 2, this.r);
        m7.y.V(parcel, 3, this.s);
        m7.y.U(parcel, 4, this.t, i);
        long j = this.u;
        m7.y.Y(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.v;
        m7.y.Y(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        m7.y.V(parcel, 7, this.w);
        m7.y.U(parcel, 8, this.x, i);
        long j2 = this.y;
        m7.y.Y(parcel, 9, 8);
        parcel.writeLong(j2);
        m7.y.U(parcel, 10, this.z, i);
        m7.y.Y(parcel, 11, 8);
        parcel.writeLong(this.A);
        m7.y.U(parcel, 12, this.B, i);
        m7.y.a0(parcel, Z);
    }

    public f(String str, String str2, q4 q4Var, long j, boolean z, String str3, w wVar, long j2, w wVar2, long j3, w wVar3) {
        this.r = str;
        this.s = str2;
        this.t = q4Var;
        this.u = j;
        this.v = z;
        this.w = str3;
        this.x = wVar;
        this.y = j2;
        this.z = wVar2;
        this.A = j3;
        this.B = wVar3;
    }
}
