package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h4 extends d21.a {
    public static final Parcelable.Creator<h4> CREATOR = new c21.c0(10);
    public final List r;

    public h4(ArrayList arrayList) {
        this.r = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.X(parcel, 1, this.r);
        m7.y.a0(parcel, Z);
    }
}
