package dw;

import java.util.List;
import m10.n40;
import m10.py;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c4 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public a4 e;
    public String f;
    public n40 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public py l;
    public List m;
    public boolean n;
    public boolean o;
    public z3 p;
    public y3 q;
    public b4 r;

    public c4(String str, String str2, String str3, boolean z, a4 a4Var, String str4, n40 n40Var, boolean z2, boolean z3, boolean z4, String str5, py pyVar, List list, boolean z5, boolean z6, z3 z3Var, y3 y3Var, b4 b4Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = a4Var;
        this.f = str4;
        this.g = n40Var;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str5;
        this.l = pyVar;
        this.m = list;
        this.n = z5;
        this.o = z6;
        this.p = z3Var;
        this.q = y3Var;
        this.r = b4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return k71.k.b(this.a, c4Var.a) && k71.k.b(this.b, c4Var.b) && k71.k.b(this.c, c4Var.c) && this.d == c4Var.d && k71.k.b(this.e, c4Var.e) && k71.k.b(this.f, c4Var.f) && this.g == c4Var.g && this.h == c4Var.h && this.i == c4Var.i && this.j == c4Var.j && k71.k.b(this.k, c4Var.k) && this.l == c4Var.l && k71.k.b(this.m, c4Var.m) && this.n == c4Var.n && this.o == c4Var.o && k71.k.b(this.p, c4Var.p) && k71.k.b(this.q, c4Var.q) && k71.k.b(this.r, c4Var.r);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i((this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31, this.f, 31);
        n40 n40Var = this.g;
        int e = x.i.e(x.i.e(x.i.e((i + (n40Var == null ? 0 : n40Var.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int hashCode = (this.l.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.m;
        int e2 = x.i.e(x.i.e((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.n), 31, this.o);
        z3 z3Var = this.p;
        int hashCode2 = (e2 + (z3Var == null ? 0 : Integer.hashCode(z3Var.a))) * 31;
        y3 y3Var = this.q;
        int hashCode3 = (hashCode2 + (y3Var == null ? 0 : y3Var.hashCode())) * 31;
        b4 b4Var = this.r;
        return hashCode3 + (b4Var != null ? Integer.hashCode(b4Var.a) : 0);
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
        o.append(", viewerCodingAgents=");
        o.append(this.r);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
