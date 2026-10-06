package oj0;

import gn0.bm;
import gn0.jr;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s2 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public r2 e;
    public String f;
    public jr g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public bm l;
    public List m;
    public boolean n;
    public boolean o;
    public q2 p;

    public s2(String str, String str2, String str3, boolean z, r2 r2Var, String str4, jr jrVar, boolean z2, boolean z3, boolean z4, String str5, bm bmVar, List list, boolean z5, boolean z6, q2 q2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = r2Var;
        this.f = str4;
        this.g = jrVar;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str5;
        this.l = bmVar;
        this.m = list;
        this.n = z5;
        this.o = z6;
        this.p = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return k71.k.b(this.a, s2Var.a) && k71.k.b(this.b, s2Var.b) && k71.k.b(this.c, s2Var.c) && this.d == s2Var.d && k71.k.b(this.e, s2Var.e) && k71.k.b(this.f, s2Var.f) && this.g == s2Var.g && this.h == s2Var.h && this.i == s2Var.i && this.j == s2Var.j && k71.k.b(this.k, s2Var.k) && this.l == s2Var.l && k71.k.b(this.m, s2Var.m) && this.n == s2Var.n && this.o == s2Var.o && k71.k.b(this.p, s2Var.p);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31, this.f, 31);
        jr jrVar = this.g;
        int e = x.i.e(x.i.e(x.i.e((i + (jrVar == null ? 0 : jrVar.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int hashCode = (this.l.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.m;
        int e2 = x.i.e(x.i.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.n), 31, this.o);
        q2 q2Var = this.p;
        return e2 + (q2Var != null ? q2Var.hashCode() : 0);
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
