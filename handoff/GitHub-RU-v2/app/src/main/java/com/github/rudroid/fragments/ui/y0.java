package com.github.rudroid.fragments.ui;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class y0 implements Parcelable {
    public static final Parcelable.Creator<y0> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public x0 f14751r;

    /* renamed from: s, reason: collision with root package name */
    public int f14752s;

    public static final class a implements Parcelable.Creator<y0> {
        @Override // android.os.Parcelable.Creator
        public final y0 createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new y0(x0.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final y0[] newArray(int i) {
            return new y0[i];
        }
    }

    public y0(x0 x0Var, int i) {
        k71.k.g(x0Var, "action");
        this.f14751r = x0Var;
        this.f14752s = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f14751r == y0Var.f14751r && this.f14752s == y0Var.f14752s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14752s) + (this.f14751r.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationDialogState(action=" + this.f14751r + ", itemCount=" + this.f14752s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.f14751r.name());
        parcel.writeInt(this.f14752s);
    }
}
