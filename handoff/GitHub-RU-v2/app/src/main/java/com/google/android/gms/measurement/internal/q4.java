package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 extends d21.a {
    public static final Parcelable.Creator<q4> CREATOR = new c21.c0(11);
    public final int r;
    public final String s;
    public final long t;
    public final Long u;
    public final String v;
    public final String w;
    public final Double x;

    public q4(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.r = i;
        this.s = str;
        this.t = j;
        this.u = l;
        this.x = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.v = str2;
        this.w = str3;
    }

    public final Object j() {
        Long l = this.u;
        if (l != null) {
            return l;
        }
        Double d = this.x;
        if (d != null) {
            return d;
        }
        String str = this.v;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c21.c0.c(this, parcel);
    }

    public q4(long j, Object obj, String str, String str2) {
        c21.u.d(str);
        this.r = 2;
        this.s = str;
        this.t = j;
        this.w = str2;
        if (obj == null) {
            this.u = null;
            this.x = null;
            this.v = null;
            return;
        }
        if (obj instanceof Long) {
            this.u = (Long) obj;
            this.x = null;
            this.v = null;
        } else if (obj instanceof String) {
            this.u = null;
            this.x = null;
            this.v = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.u = null;
                this.x = (Double) obj;
                this.v = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public q4(r4 r4Var) {
        this(r4Var.d, r4Var.e, r4Var.c, r4Var.b);
    }
}
