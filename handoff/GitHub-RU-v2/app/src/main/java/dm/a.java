package dm;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import f1.e;
import jo.f4;
import k71.k;
import x.i;
import yz0.f;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements f {
    public static final Parcelable.Creator<a> CREATOR = new c0(17);
    public final String r;
    public final Avatar s;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public a(String str, Avatar avatar, String str2, String str3, boolean z, boolean z2, boolean z3) {
        k.g(str, "login");
        k.g(avatar, "avatar");
        k.g(str2, "id");
        k.g(str3, "name");
        this.r = str;
        this.s = avatar;
        this.t = str2;
        this.u = str3;
        this.v = z;
        this.w = z2;
        this.x = z3;
    }

    public final String d() {
        return this.r;
    }

    public final int describeContents() {
        return 0;
    }

    public final Avatar e() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.r, aVar.r) && k.b(this.s, aVar.s) && k.b(this.t, aVar.t) && k.b(this.u, aVar.u) && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x;
    }

    public final String getId() {
        return this.t;
    }

    public final String getName() {
        return this.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + i.e(i.e(h1.i(h1.i(h1.j(this.s, this.r.hashCode() * 31, 31), this.t, 31), this.u, 31), 31, this.v), 31, this.w);
    }

    public final boolean q() {
        return this.v;
    }

    public final boolean s() {
        return this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleAssignee(login=");
        sb.append(this.r);
        sb.append(", avatar=");
        sb.append(this.s);
        sb.append(", id=");
        e.x(sb, this.t, ", name=", this.u, ", isBot=");
        m0.A(sb, this.v, ", isCopilot=", this.w, ", isAgent=");
        return f4.s(sb, this.x, ")");
    }

    public final boolean u() {
        return this.x;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeParcelable(this.s, i);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }
}
