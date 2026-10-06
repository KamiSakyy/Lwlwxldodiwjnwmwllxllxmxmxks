package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 implements f {
    public static final Parcelable.Creator<b2> CREATOR = new h(19);
    public String r;
    public Avatar s;
    public String t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;

    public b2(String str, Avatar avatar, String str2, String str3, boolean z, boolean z2, boolean z3) {
        k71.k.g(str, "login");
        k71.k.g(avatar, "avatar");
        k71.k.g(str2, "id");
        k71.k.g(str3, "name");
        this.r = str;
        this.s = avatar;
        this.t = str2;
        this.u = str3;
        this.v = z;
        this.w = z2;
        this.x = z3;
    }

    @Override // yz0.f
    public final String d() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // yz0.f
    public final Avatar e() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return k71.k.b(this.r, b2Var.r) && k71.k.b(this.s, b2Var.s) && k71.k.b(this.t, b2Var.t) && k71.k.b(this.u, b2Var.u) && this.v == b2Var.v && this.w == b2Var.w && this.x == b2Var.x;
    }

    @Override // yz0.f
    public final String getId() {
        return this.t;
    }

    @Override // yz0.f
    public final String getName() {
        return this.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.j(this.s, this.r.hashCode() * 31, 31), this.t, 31), this.u, 31), 31, this.v), 31, this.w);
    }

    @Override // yz0.f
    public final boolean q() {
        return this.v;
    }

    @Override // yz0.f
    public final boolean s() {
        return this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueOrPullRequestAssignee(login=");
        sb.append(this.r);
        sb.append(", avatar=");
        sb.append(this.s);
        sb.append(", id=");
        f1.e.x(sb, this.t, ", name=", this.u, ", isBot=");
        com.github.rudroid.m0.A(sb, this.v, ", isCopilot=", this.w, ", isAgent=");
        return jo.f4Shadow.s(sb, this.x, ")");
    }

    @Override // yz0.f
    public final boolean u() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        this.s.writeToParcel(parcel, i);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public /* synthetic */ b2(String str, Avatar avatar, String str2, String str3, boolean z, boolean z2, int i) {
        this(str, avatar, str2, str3, (i & 16) != 0 ? false : z, false, (i & 64) != 0 ? false : z2);
    }
}
