package com.google.android.gms.common.api;

import a21.g;
import android.os.Parcel;
import android.os.Parcelable;
import c21.u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d21.a;
import m7.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new g(0);
    public final int r;
    public final String s;

    public Scope(String str, int i) {
        u.e(str, "scopeUri must not be null or empty");
        this.r = i;
        this.s = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.s.equals(((Scope) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = y.Z(parcel, 20293);
        y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        y.V(parcel, 2, this.s);
        y.a0(parcel, Z);
    }
}
