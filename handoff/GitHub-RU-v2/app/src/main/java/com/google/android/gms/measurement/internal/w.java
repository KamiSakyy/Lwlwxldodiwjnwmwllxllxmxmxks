package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w extends d21.a {
    public static final Parcelable.Creator<w> CREATOR = new c21.c0(6);
    public String r;
    public v s;
    public String t;
    public long u;

    public w(w wVar, long j) {
        c21.u.g(wVar);
        this.r = wVar.r;
        this.s = wVar.s;
        this.t = wVar.t;
        this.u = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.s);
        String str = this.t;
        int length = String.valueOf(str).length();
        String str2 = this.r;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        f1.e.x(sb, "origin=", str, ",name=", str2);
        return com.github.rudroid.copilot.h1.p(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c21.c0.b(this, parcel, i);
    }

    public w(String str, v vVar, String str2, long j) {
        this.r = str;
        this.s = vVar;
        this.t = str2;
        this.u = j;
    }
    public Object a(Object p1) { return null; }
    public Object k(Object p1, Object p2) { return null; }
    public Object l(Object p1) { return null; }
    public Object k(int p1, Object p2) { return null; }
}
