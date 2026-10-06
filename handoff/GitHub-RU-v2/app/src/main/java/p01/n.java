package p01;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import jo.f4Shadow;
import l7.c0;
import yz0.n5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new c0(5);
    public boolean A;
    public String B;
    public String C;
    public boolean D;
    public String E;
    public String r;
    public com.github.service.models.response.a s;
    public boolean t;
    public String u;
    public int v;
    public String w;
    public String x;
    public int y;
    public n5 z;

    public n(String str, com.github.service.models.response.a aVar, boolean z, String str2, int i, String str3, String str4, int i2, n5 n5Var, boolean z2, String str5, String str6, boolean z3, String str7) {
        k71.k.g(str, "id");
        k71.k.g(aVar, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str4, "shortDescriptionHtml");
        k71.k.g(n5Var, "templateModel");
        k71.k.g(str6, "url");
        this.r = str;
        this.s = aVar;
        this.t = z;
        this.u = str2;
        this.v = i;
        this.w = str3;
        this.x = str4;
        this.y = i2;
        this.z = n5Var;
        this.A = z2;
        this.B = str5;
        this.C = str6;
        this.D = z3;
        this.E = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.r, nVar.r) && k71.k.b(this.s, nVar.s) && this.t == nVar.t && k71.k.b(this.u, nVar.u) && this.v == nVar.v && k71.k.b(this.w, nVar.w) && k71.k.b(this.x, nVar.x) && this.y == nVar.y && k71.k.b(this.z, nVar.z) && this.A == nVar.A && k71.k.b(this.B, nVar.B) && k71.k.b(this.C, nVar.C) && this.D == nVar.D && k71.k.b(this.E, nVar.E);
    }

    public final int hashCode() {
        int b = s0.b(this.v, h1.i(x.i.e(f4Shadow.b(this.s, this.r.hashCode() * 31, 31), 31, this.t), this.u, 31), 31);
        String str = this.w;
        int e = x.i.e((this.z.hashCode() + s0.b(this.y, h1.i((b + (str == null ? 0 : str.hashCode())) * 31, this.x, 31), 31)) * 31, 31, this.A);
        String str2 = this.B;
        int e2 = x.i.e(h1.i((e + (str2 == null ? 0 : str2.hashCode())) * 31, this.C, 31), 31, this.D);
        String str3 = this.E;
        return e2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryItem(id=");
        sb.append(this.r);
        sb.append(", owner=");
        sb.append(this.s);
        sb.append(", isPrivate=");
        m0.z(sb, this.t, ", name=", this.u, ", languageColor=");
        x.i.r(this.v, ", languageName=", this.w, ", shortDescriptionHtml=", sb);
        s0.w(this.y, this.x, ", starCount=", ", templateModel=", sb);
        sb.append(this.z);
        sb.append(", isStarred=");
        sb.append(this.A);
        sb.append(", coverImageUrl=");
        f1.e.x(sb, this.B, ", url=", this.C, ", isFork=");
        return m0.l(sb, this.D, ", parent=", this.E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        this.s.writeToParcel(parcel, i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeParcelable(this.z, i);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeString(this.E);
    }
}
