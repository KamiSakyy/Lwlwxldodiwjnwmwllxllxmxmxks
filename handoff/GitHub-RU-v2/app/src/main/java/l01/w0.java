package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 implements Parcelable {
    public static final Parcelable.Creator<w0> CREATOR = new c(26);
    public String A;
    public String r;
    public int s;
    public String t;
    public ZonedDateTime u;
    public String v;
    public boolean w;
    public String x;
    public boolean y;
    public String z;

    public w0(String str, int i, String str2, ZonedDateTime zonedDateTime, String str3, boolean z, String str4, boolean z2, String str5, String str6) {
        k71.k.g(str, "id");
        k71.k.g(zonedDateTime, "updatedAt");
        k71.k.g(str4, "url");
        this.r = str;
        this.s = i;
        this.t = str2;
        this.u = zonedDateTime;
        this.v = str3;
        this.w = z;
        this.x = str4;
        this.y = z2;
        this.z = str5;
        this.A = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.r, w0Var.r) && this.s == w0Var.s && k71.k.b(this.t, w0Var.t) && k71.k.b(this.u, w0Var.u) && k71.k.b(this.v, w0Var.v) && this.w == w0Var.w && k71.k.b(this.x, w0Var.x) && this.y == w0Var.y && k71.k.b(this.z, w0Var.z) && k71.k.b(this.A, w0Var.A);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.s, this.r.hashCode() * 31, 31);
        String str = this.t;
        int a = com.github.rudroid.m0.a(this.u, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.v;
        int e = x.i.e(h1.i(x.i.e((a + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.w), this.x, 31), 31, this.y);
        String str3 = this.z;
        int hashCode = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A;
        return hashCode + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.s, "SimpleProject(id=", this.r, ", number=", ", title=");
        h1.A(this.t, ", updatedAt=", ", description=", n, this.u);
        com.github.rudroid.m0.x(n, this.v, ", isPublic=", this.w, ", url=");
        com.github.rudroid.m0.x(n, this.x, ", closed=", this.y, ", repoNameWithOwner=");
        return x.i.k(n, this.z, ", ownerLogin=", this.A, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeSerializable(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeString(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
    }
}
