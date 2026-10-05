package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements l0, Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new l7.c0(29);
    public final String A;
    public final Boolean B;
    public final int r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public h0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "url");
        k71.k.g(str4, "path");
        k71.k.g(str5, "commitOid");
        k71.k.g(str6, "ref");
        k71.k.g(str7, "repositoryOwner");
        k71.k.g(str8, "repositoryName");
        this.r = i;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = str6;
        this.y = str7;
        this.z = str8;
        this.A = str9;
        this.B = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.r == h0Var.r && k71.k.b(this.s, h0Var.s) && k71.k.b(this.t, h0Var.t) && k71.k.b(this.u, h0Var.u) && k71.k.b(this.v, h0Var.v) && k71.k.b(this.w, h0Var.w) && k71.k.b(this.x, h0Var.x) && k71.k.b(this.y, h0Var.y) && k71.k.b(this.z, h0Var.z) && k71.k.b(this.A, h0Var.A) && k71.k.b(this.B, h0Var.B);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Integer.hashCode(this.r) * 31, this.s, 31), this.t, 31), this.u, 31), this.v, 31), this.w, 31), this.x, 31), this.y, 31), this.z, 31);
        String str = this.A;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.B;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.r, "FileReference(repoId=", ", repoOwner=", this.s, ", repoName=");
        f1.e.x(n, this.t, ", url=", this.u, ", path=");
        f1.e.x(n, this.v, ", commitOid=", this.w, ", ref=");
        f1.e.x(n, this.x, ", repositoryOwner=", this.y, ", repositoryName=");
        f1.e.x(n, this.z, ", avatarUrl=", this.A, ", isInOrganization=");
        n.append(this.B);
        n.append(")");
        return n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        Boolean bool = this.B;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
