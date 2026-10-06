package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 extends d21.a {
    public static final Parcelable.Creator<w0> CREATOR = new v0(1);
    public int r;
    public String s;
    public Intent t;

    public w0(int i, Intent intent, String str) {
        this.r = i;
        this.s = str;
        this.t = intent;
    }

    public static w0 j(Activity activity) {
        return new w0(activity.hashCode(), activity.getIntent(), activity.getClass().getCanonicalName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.r == w0Var.r && Objects.equals(this.s, w0Var.s) && Objects.equals(this.t, w0Var.t);
    }

    public final int hashCode() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        m7.y.V(parcel, 2, this.s);
        m7.y.U(parcel, 3, this.t, i);
        m7.y.a0(parcel, Z);
    }
    public Object K(Object) { return null; }
    public Object v() { return null; }
}
