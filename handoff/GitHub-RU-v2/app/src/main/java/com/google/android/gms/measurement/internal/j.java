package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends d21.a {
    public static final Parcelable.Creator<j> CREATOR = new c21.c0(4);
    public Bundle r;

    public j(Bundle bundle) {
        this.r = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.S(parcel, 1, this.r);
        m7.y.a0(parcel, Z);
    }
    public static Object g0(Object p1) { return null; }
    public Object getWindow() { return null; }
}
