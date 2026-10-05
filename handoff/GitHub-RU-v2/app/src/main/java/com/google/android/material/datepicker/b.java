package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new c0(13);
    public final m r;
    public final m s;
    public final d t;
    public final m u;
    public final int v;
    public final int w;
    public final int x;

    public b(m mVar, m mVar2, d dVar, m mVar3, int i) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.r = mVar;
        this.s = mVar2;
        this.u = mVar3;
        this.v = i;
        this.t = dVar;
        if (mVar3 != null && mVar.r.compareTo(mVar3.r) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.r.compareTo(mVar2.r) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > t.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.x = mVar.o(mVar2) + 1;
        this.w = (mVar2.t - mVar.t) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.r.equals(bVar.r) && this.s.equals(bVar.s) && Objects.equals(this.u, bVar.u) && this.v == bVar.v && this.t.equals(bVar.t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.r, this.s, this.u, Integer.valueOf(this.v), this.t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.r, 0);
        parcel.writeParcelable(this.s, 0);
        parcel.writeParcelable(this.u, 0);
        parcel.writeParcelable(this.t, 0);
        parcel.writeInt(this.v);
    }
}
