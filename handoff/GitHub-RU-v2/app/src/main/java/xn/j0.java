package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements l0, Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new i0(0);
    public o0 A;
    public String B;
    public String C;
    public String D;
    public boolean E;
    public int r;
    public String s;
    public String t;
    public n0 u;
    public String v;
    public String w;
    public String x;
    public String y;
    public m0 z;

    public j0(int i, String str, String str2, n0 n0Var, String str3, String str4, String str5, String str6, m0 m0Var, o0 o0Var, String str7, String str8, String str9, boolean z) {
        k71.k.g(str, "name");
        k71.k.g(str2, "ownerLogin");
        k71.k.g(n0Var, "ownerType");
        k71.k.g(str3, "readmePath");
        k71.k.g(str4, "description");
        k71.k.g(str5, "commitOid");
        k71.k.g(str6, "ref");
        k71.k.g(m0Var, "chatMessageReferenceInfo");
        k71.k.g(o0Var, "visibility");
        k71.k.g(str8, "repositoryOwner");
        k71.k.g(str9, "repositoryName");
        this.r = i;
        this.s = str;
        this.t = str2;
        this.u = n0Var;
        this.v = str3;
        this.w = str4;
        this.x = str5;
        this.y = str6;
        this.z = m0Var;
        this.A = o0Var;
        this.B = str7;
        this.C = str8;
        this.D = str9;
        this.E = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.r == j0Var.r && k71.k.b(this.s, j0Var.s) && k71.k.b(this.t, j0Var.t) && this.u == j0Var.u && k71.k.b(this.v, j0Var.v) && k71.k.b(this.w, j0Var.w) && k71.k.b(this.x, j0Var.x) && k71.k.b(this.y, j0Var.y) && k71.k.b(this.z, j0Var.z) && this.A == j0Var.A && k71.k.b(this.B, j0Var.B) && k71.k.b(this.C, j0Var.C) && k71.k.b(this.D, j0Var.D) && this.E == j0Var.E;
    }

    public final int hashCode() {
        int hashCode = (this.A.hashCode() + ((this.z.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Integer.hashCode(this.r) * 31, this.s, 31), this.t, 31)) * 31, this.v, 31), this.w, 31), this.x, 31), this.y, 31)) * 31)) * 31;
        String str = this.B;
        return Boolean.hashCode(this.E) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.C, 31), this.D, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.r, "RepositoryReference(id=", ", name=", this.s, ", ownerLogin=");
        n.append(this.t);
        n.append(", ownerType=");
        n.append(this.u);
        n.append(", readmePath=");
        f1.e.x(n, this.v, ", description=", this.w, ", commitOid=");
        f1.e.x(n, this.x, ", ref=", this.y, ", chatMessageReferenceInfo=");
        n.append(this.z);
        n.append(", visibility=");
        n.append(this.A);
        n.append(", avatarUrl=");
        f1.e.x(n, this.B, ", repositoryOwner=", this.C, ", repositoryName=");
        return com.github.rudroid.m0.k(n, this.D, ", isInOrganization=", this.E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u.name());
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        this.z.writeToParcel(parcel, i);
        parcel.writeString(this.A.name());
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E ? 1 : 0);
    }
}
