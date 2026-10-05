package com.github.rudroid.activities.util;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class q implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final int f5930r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5931s;
    public static final a Companion = new a();
    public static final Parcelable.Creator<q> CREATOR = new b();

    public static final class a {
    }

    public static final class b implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new q(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i) {
            return new q[i];
        }
    }

    public q(int i, int i10) {
        this.f5930r = i;
        this.f5931s = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f5930r == qVar.f5930r && this.f5931s == qVar.f5931s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5931s) + (Integer.hashCode(this.f5930r) * 31);
    }

    public final String toString() {
        return this.f5930r + "." + this.f5931s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.f5930r);
        parcel.writeInt(this.f5931s);
    }
}
