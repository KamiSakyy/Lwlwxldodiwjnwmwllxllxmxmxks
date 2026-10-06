package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e extends d21.a {
    public static final Parcelable.Creator<e> CREATOR = new c21.c0(2);
    public long r;
    public int s;
    public long t;

    public e(int i, long j, long j2) {
        this.r = j;
        this.s = i;
        this.t = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 8);
        parcel.writeLong(this.r);
        m7.y.Y(parcel, 2, 4);
        parcel.writeInt(this.s);
        m7.y.Y(parcel, 3, 8);
        parcel.writeLong(this.t);
        m7.y.a0(parcel, Z);
    }

    public e(Object... a) {
    }
    public Object containsKey(Object p1) { return null; }
    public Object get(Object p1) { return null; }
    public Object get(Object p1) { return null; }
    public Object isEmpty() { return null; }
    public Object keySet() { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object put(Object p1, int p2) { return null; }
    public Object put(Object p1, Object p2) { return null; }
    public Object remove(Object p1) { return null; }
    public Object remove(Object p1) { return null; }
}
