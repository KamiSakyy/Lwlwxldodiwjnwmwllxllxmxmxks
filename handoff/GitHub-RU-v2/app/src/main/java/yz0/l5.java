package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l5 implements n5 {
    public static final Parcelable.Creator<l5> CREATOR = new e5(5);
    public List r;
    public List s;
    public i5 t;
    public boolean u;
    public boolean v;
    public String w;
    public List x;

    public l5(List list, List list2, i5 i5Var, boolean z, boolean z2, String str, List list3) {
        k71.k.g(list, "templates");
        k71.k.g(list2, "contactLinks");
        k71.k.g(str, "repoId");
        k71.k.g(list3, "issueFormLinks");
        this.r = list;
        this.s = list2;
        this.t = i5Var;
        this.u = z;
        this.v = z2;
        this.w = str;
        this.x = list3;
    }

    @Override // yz0.n5
    public final boolean D() {
        return this.u;
    }

    @Override // yz0.n5
    public final i5 F() {
        return this.t;
    }

    @Override // yz0.n5
    public final List I() {
        return this.s;
    }

    @Override // yz0.n5
    public final boolean R() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return k71.k.b(this.r, l5Var.r) && k71.k.b(this.s, l5Var.s) && k71.k.b(this.t, l5Var.t) && this.u == l5Var.u && this.v == l5Var.v && k71.k.b(this.w, l5Var.w) && k71.k.b(this.x, l5Var.x);
    }

    public final int hashCode() {
        int c = f1.e.c(this.s, this.r.hashCode() * 31, 31);
        i5 i5Var = this.t;
        return this.x.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(x.i.e((c + (i5Var == null ? 0 : i5Var.s.hashCode())) * 31, 31, this.u), 31, this.v), this.w, 31);
    }

    @Override // yz0.n5
    public final List n() {
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyTemplate(templates=");
        sb.append(this.r);
        sb.append(", contactLinks=");
        sb.append(this.s);
        sb.append(", securityPolicy=");
        sb.append(this.t);
        sb.append(", isBlankIssuesEnabled=");
        sb.append(this.u);
        sb.append(", isSecurityPolicyEnabled=");
        com.github.rudroid.m0.z(sb, this.v, ", repoId=", this.w, ", issueFormLinks=");
        return x.i.l(sb, this.x, ")");
    }

    @Override // yz0.n5
    public final List w() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        Iterator q = f1.e.q(this.r, parcel);
        while (q.hasNext()) {
            ((j5) q.next()).writeToParcel(parcel, i);
        }
        Iterator q2 = f1.e.q(this.s, parcel);
        while (q2.hasNext()) {
            ((g5) q2.next()).writeToParcel(parcel, i);
        }
        i5 i5Var = this.t;
        if (i5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i5Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
        Iterator q3 = f1.e.q(this.x, parcel);
        while (q3.hasNext()) {
            ((h5) q3.next()).writeToParcel(parcel, i);
        }
    }

    @Override // yz0.n5
    public final String x() {
        return this.w;
    }
}
