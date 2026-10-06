package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v extends d21.a implements Iterable {
    public static final Parcelable.Creator<v> CREATOR = new c21.c0(5);
    public Bundle r;

    public v(Bundle bundle) {
        this.r = bundle;
    }

    public final Bundle C() {
        return new Bundle(this.r);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    public final Object j(String str) {
        return this.r.get(str);
    }

    public final Double o() {
        return Double.valueOf(this.r.getDouble("value"));
    }

    public final String toString() {
        return this.r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.S(parcel, 2, C());
        m7.y.a0(parcel, Z);
    }

    public final String z() {
        return this.r.getString("currency");
    }
}
