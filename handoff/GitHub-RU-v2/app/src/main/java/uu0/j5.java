package uu0;

import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public int d;
    public bf e;
    public c5 f;
    public d5 g;
    public df h;
    public e5 i;
    public i5 j;
    public h5 k;
    public d6 l;

    public j5(String str, String str2, String str3, int i, bf bfVar, c5 c5Var, d5 d5Var, df dfVar, e5 e5Var, i5 i5Var, h5 h5Var, d6 d6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = bfVar;
        this.f = c5Var;
        this.g = d5Var;
        this.h = dfVar;
        this.i = e5Var;
        this.j = i5Var;
        this.k = h5Var;
        this.l = d6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return k71.k.b(this.a, j5Var.a) && k71.k.b(this.b, j5Var.b) && k71.k.b(this.c, j5Var.c) && this.d == j5Var.d && this.e == j5Var.e && k71.k.b(this.f, j5Var.f) && k71.k.b(this.g, j5Var.g) && this.h == j5Var.h && k71.k.b(this.i, j5Var.i) && k71.k.b(this.j, j5Var.j) && k71.k.b(this.k, j5Var.k) && k71.k.b(this.l, j5Var.l);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31)) * 31;
        d5 d5Var = this.g;
        int hashCode2 = (hashCode + (d5Var == null ? 0 : Integer.hashCode(d5Var.a))) * 31;
        df dfVar = this.h;
        int hashCode3 = (hashCode2 + (dfVar == null ? 0 : dfVar.hashCode())) * 31;
        e5 e5Var = this.i;
        int hashCode4 = (this.j.hashCode() + ((hashCode3 + (e5Var == null ? 0 : e5Var.hashCode())) * 31)) * 31;
        h5 h5Var = this.k;
        return this.l.hashCode() + ((hashCode4 + (h5Var != null ? h5Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SubIssueFragment(__typename=", this.a, ", id=", this.b, ", titleHTML=");
        a0.s0.w(this.d, this.c, ", number=", ", issueState=", o);
        o.append(this.e);
        o.append(", assignees=");
        o.append(this.f);
        o.append(", closedByPullRequestsReferences=");
        o.append(this.g);
        o.append(", stateReason=");
        o.append(this.h);
        o.append(", issueType=");
        o.append(this.i);
        o.append(", repository=");
        o.append(this.j);
        o.append(", parent=");
        o.append(this.k);
        o.append(", subIssueProgressFragment=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }
}
