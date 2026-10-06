package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t7 implements Parcelable {
    public static final Parcelable.Creator<t7> CREATOR = new e5(6);
    public String r;
    public String s;
    public String t;
    public Avatar u;
    public n5 v;
    public String w;
    public String x;

    public t7(String str, String str2, String str3, Avatar avatar, n5 n5Var, String str4, String str5) {
        k71.k.g(str, "name");
        k71.k.g(str2, "id");
        k71.k.g(str3, "owner");
        k71.k.g(avatar, "avatar");
        k71.k.g(n5Var, "templateModel");
        k71.k.g(str4, "url");
        k71.k.g(str5, "nameWithOwner");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = avatar;
        this.v = n5Var;
        this.w = str4;
        this.x = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return k71.k.b(this.r, t7Var.r) && k71.k.b(this.s, t7Var.s) && k71.k.b(this.t, t7Var.t) && k71.k.b(this.u, t7Var.u) && k71.k.b(this.v, t7Var.v) && k71.k.b(this.w, t7Var.w) && k71.k.b(this.x, t7Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + com.github.rudroid.copilot.h1.i((this.v.hashCode() + com.github.rudroid.copilot.h1.j(this.u, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31)) * 31, this.w, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TopRepository(name=", this.r, ", id=", this.s, ", owner=");
        o.append(this.t);
        o.append(", avatar=");
        o.append(this.u);
        o.append(", templateModel=");
        o.append(this.v);
        o.append(", url=");
        o.append(this.w);
        o.append(", nameWithOwner=");
        return com.github.rudroid.copilot.h1.p(o, this.x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        this.u.writeToParcel(parcel, i);
        parcel.writeParcelable(this.v, i);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
    }

    public /* synthetic */ t7(String str, String str2, String str3, Avatar avatar, n5 n5Var, String str4) {
        this(str, str2, str3, avatar, n5Var, str4, f1.e.h(str3, " / ", str));
    }
    public t7(String p1, String p2, String p3, Object p4, Object p5, String p6) {
    }
}
