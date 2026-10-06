package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e8 implements Parcelable {
    public static final Parcelable.Creator<e8> CREATOR = new e5(8);
    public final String r;
    public final String s;
    public final int t;
    public final String u;

    public e8(int i, String str, String str2, String str3) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(str3, "slug");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return k71.k.b(this.r, e8Var.r) && k71.k.b(this.s, e8Var.s) && this.t == e8Var.t && k71.k.b(this.u, e8Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.c(this.t, ", slug=", this.u, ")", a0.s0.o("UserList(id=", this.r, ", name=", this.s, ", repoCount="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
    }
}
