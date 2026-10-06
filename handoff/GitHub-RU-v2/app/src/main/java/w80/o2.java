package w80;

import hc0.fq;
import hc0.zk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public n2 e;
    public String f;
    public fq g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public zk l;
    public List m;
    public boolean n;
    public boolean o;
    public m2 p;

    public o2(String str, String str2, String str3, boolean z, n2 n2Var, String str4, fq fqVar, boolean z2, boolean z3, boolean z4, String str5, zk zkVar, List list, boolean z5, boolean z6, m2 m2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = n2Var;
        this.f = str4;
        this.g = fqVar;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str5;
        this.l = zkVar;
        this.m = list;
        this.n = z5;
        this.o = z6;
        this.p = m2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.a, o2Var.a) && k71.k.b(this.b, o2Var.b) && k71.k.b(this.c, o2Var.c) && this.d == o2Var.d && k71.k.b(this.e, o2Var.e) && k71.k.b(this.f, o2Var.f) && this.g == o2Var.g && this.h == o2Var.h && this.i == o2Var.i && this.j == o2Var.j && k71.k.b(this.k, o2Var.k) && this.l == o2Var.l && k71.k.b(this.m, o2Var.m) && this.n == o2Var.n && this.o == o2Var.o && k71.k.b(this.p, o2Var.p);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31, this.f, 31);
        fq fqVar = this.g;
        int e = x.i.e(x.i.e(x.i.e((i + (fqVar == null ? 0 : fqVar.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int hashCode = (this.l.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.m;
        int e2 = x.i.e(x.i.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.n), 31, this.o);
        m2 m2Var = this.p;
        return e2 + (m2Var != null ? m2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryNodeFragmentBase(__typename=", this.a, ", name=", this.b, ", url=");
        com.github.rudroid.m0.x(o, this.c, ", isInOrganization=", this.d, ", owner=");
        o.append(this.e);
        o.append(", id=");
        o.append(this.f);
        o.append(", viewerPermission=");
        o.append(this.g);
        o.append(", squashMergeAllowed=");
        o.append(this.h);
        o.append(", rebaseMergeAllowed=");
        com.github.rudroid.m0.A(o, this.i, ", mergeCommitAllowed=", this.j, ", viewerDefaultCommitEmail=");
        o.append(this.k);
        o.append(", viewerDefaultMergeMethod=");
        o.append(this.l);
        o.append(", viewerPossibleCommitEmails=");
        com.github.rudroid.copilot.h1.C(o, this.m, ", planSupports=", this.n, ", allowUpdateBranch=");
        o.append(this.o);
        o.append(", defaultBranchRef=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
