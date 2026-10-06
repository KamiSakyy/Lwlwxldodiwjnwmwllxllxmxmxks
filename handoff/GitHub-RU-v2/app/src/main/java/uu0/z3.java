package uu0;

import java.util.List;
import pz0.py;
import pz0.zs;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z3 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final y3 e;
    public final String f;
    public final py g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final zs l;
    public final List m;
    public final boolean n;
    public final boolean o;
    public final x3 p;
    public final w3 q;

    public z3(String str, String str2, String str3, boolean z, y3 y3Var, String str4, py pyVar, boolean z2, boolean z3, boolean z4, String str5, zs zsVar, List list, boolean z5, boolean z6, x3 x3Var, w3 w3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = y3Var;
        this.f = str4;
        this.g = pyVar;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str5;
        this.l = zsVar;
        this.m = list;
        this.n = z5;
        this.o = z6;
        this.p = x3Var;
        this.q = w3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return k71.k.b(this.a, z3Var.a) && k71.k.b(this.b, z3Var.b) && k71.k.b(this.c, z3Var.c) && this.d == z3Var.d && k71.k.b(this.e, z3Var.e) && k71.k.b(this.f, z3Var.f) && this.g == z3Var.g && this.h == z3Var.h && this.i == z3Var.i && this.j == z3Var.j && k71.k.b(this.k, z3Var.k) && this.l == z3Var.l && k71.k.b(this.m, z3Var.m) && this.n == z3Var.n && this.o == z3Var.o && k71.k.b(this.p, z3Var.p) && k71.k.b(this.q, z3Var.q);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31, this.f, 31);
        py pyVar = this.g;
        int e = x.i.e(x.i.e(x.i.e((i + (pyVar == null ? 0 : pyVar.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int hashCode = (this.l.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.m;
        int e2 = x.i.e(x.i.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.n), 31, this.o);
        x3 x3Var = this.p;
        int hashCode2 = (e2 + (x3Var == null ? 0 : Integer.hashCode(x3Var.a))) * 31;
        w3 w3Var = this.q;
        return hashCode2 + (w3Var != null ? w3Var.hashCode() : 0);
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
        o.append(", issueTypes=");
        o.append(this.p);
        o.append(", defaultBranchRef=");
        o.append(this.q);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
