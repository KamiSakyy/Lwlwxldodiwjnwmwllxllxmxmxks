package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v4 extends d21.a {
    public static final Parcelable.Creator<v4> CREATOR = new c21.c0(12);
    public final long A;
    public final String B;
    public final long C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final Boolean G;
    public final long H;
    public final List I;
    public final String J;
    public final String K;
    public final String L;
    public final boolean M;
    public final long N;
    public final int O;
    public final String P;
    public final int Q;
    public final long R;
    public final String S;
    public final String T;
    public final long U;
    public final int V;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public v4(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        c21.u.d(str);
        this.r = str;
        this.s = true == TextUtils.isEmpty(str2) ? null : str2;
        this.t = str3;
        this.A = j;
        this.u = str4;
        this.v = j2;
        this.w = j3;
        this.x = str5;
        this.y = z;
        this.z = z2;
        this.B = str6;
        this.C = j4;
        this.D = i;
        this.E = z3;
        this.F = z4;
        this.G = bool;
        this.H = j5;
        this.I = list;
        this.J = str7;
        this.K = str8;
        this.L = str9;
        this.M = z5;
        this.N = j6;
        this.O = i2;
        this.P = str10;
        this.Q = i3;
        this.R = j7;
        this.S = str11;
        this.T = str12;
        this.U = j8;
        this.V = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.V(parcel, 2, this.r);
        m7.y.V(parcel, 3, this.s);
        m7.y.V(parcel, 4, this.t);
        m7.y.V(parcel, 5, this.u);
        m7.y.Y(parcel, 6, 8);
        parcel.writeLong(this.v);
        m7.y.Y(parcel, 7, 8);
        parcel.writeLong(this.w);
        m7.y.V(parcel, 8, this.x);
        m7.y.Y(parcel, 9, 4);
        parcel.writeInt(this.y ? 1 : 0);
        m7.y.Y(parcel, 10, 4);
        parcel.writeInt(this.z ? 1 : 0);
        m7.y.Y(parcel, 11, 8);
        parcel.writeLong(this.A);
        m7.y.V(parcel, 12, this.B);
        m7.y.Y(parcel, 14, 8);
        parcel.writeLong(this.C);
        m7.y.Y(parcel, 15, 4);
        parcel.writeInt(this.D);
        m7.y.Y(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        m7.y.Y(parcel, 18, 4);
        parcel.writeInt(this.F ? 1 : 0);
        Boolean bool = this.G;
        if (bool != null) {
            m7.y.Y(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        m7.y.Y(parcel, 22, 8);
        parcel.writeLong(this.H);
        List<String> list = this.I;
        if (list != null) {
            int Z2 = m7.y.Z(parcel, 23);
            parcel.writeStringList(list);
            m7.y.a0(parcel, Z2);
        }
        m7.y.V(parcel, 25, this.J);
        m7.y.V(parcel, 26, this.K);
        m7.y.V(parcel, 27, this.L);
        m7.y.Y(parcel, 28, 4);
        parcel.writeInt(this.M ? 1 : 0);
        m7.y.Y(parcel, 29, 8);
        parcel.writeLong(this.N);
        m7.y.Y(parcel, 30, 4);
        parcel.writeInt(this.O);
        m7.y.V(parcel, 31, this.P);
        m7.y.Y(parcel, 32, 4);
        parcel.writeInt(this.Q);
        m7.y.Y(parcel, 34, 8);
        parcel.writeLong(this.R);
        m7.y.V(parcel, 35, this.S);
        m7.y.V(parcel, 36, this.T);
        m7.y.Y(parcel, 37, 8);
        parcel.writeLong(this.U);
        m7.y.Y(parcel, 38, 4);
        parcel.writeInt(this.V);
        m7.y.a0(parcel, Z);
    }

    public v4(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.A = j3;
        this.u = str4;
        this.v = j;
        this.w = j2;
        this.x = str5;
        this.y = z;
        this.z = z2;
        this.B = str6;
        this.C = j4;
        this.D = i;
        this.E = z3;
        this.F = z4;
        this.G = bool;
        this.H = j5;
        this.I = arrayList;
        this.J = str7;
        this.K = str8;
        this.L = str9;
        this.M = z5;
        this.N = j6;
        this.O = i2;
        this.P = str10;
        this.Q = i3;
        this.R = j7;
        this.S = str11;
        this.T = str12;
        this.U = j8;
        this.V = i4;
    }
}
