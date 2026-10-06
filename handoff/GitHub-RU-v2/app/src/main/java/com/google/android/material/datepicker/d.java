package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c0(14);
    public long r;

    public d(long j) {
        this.r = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.r == ((d) obj).r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.r);
    }
    public Object c(Object p1) { return null; }
}
