package xn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 implements l0, Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new i0(1);
    public final String r;
    public final String s;
    public final ArrayList t;
    public final String u;
    public final String v;
    public final String w;
    public final Boolean x;

    public k0(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, Boolean bool) {
        k71.k.g(str, "query");
        k71.k.g(str2, "status");
        k71.k.g(str3, "repositoryOwner");
        k71.k.g(str4, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = arrayList;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.r, k0Var.r) && k71.k.b(this.s, k0Var.s) && this.t.equals(k0Var.t) && k71.k.b(this.u, k0Var.u) && k71.k.b(this.v, k0Var.v) && k71.k.b(this.w, k0Var.w) && k71.k.b(this.x, k0Var.x);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(no.a.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), this.u, 31), this.v, 31);
        String str = this.w;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.x;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WebSearchReference(query=", this.r, ", status=", this.s, ", results=");
        o.append(this.t);
        o.append(", repositoryOwner=");
        o.append(this.u);
        o.append(", repositoryName=");
        f1.e.x(o, this.v, ", avatarUrl=", this.w, ", isInOrganization=");
        o.append(this.x);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        ArrayList arrayList = this.t;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((h4) obj).writeToParcel(parcel, i);
        }
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        Boolean bool = this.x;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
