package dw;

import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e6 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final wi e;
    public final w5 f;
    public final x5 g;
    public final yi h;
    public final z5 i;
    public final d6 j;
    public final c6 k;
    public final y5 l;
    public final z6 m;

    public e6(String str, String str2, String str3, int i, wi wiVar, w5 w5Var, x5 x5Var, yi yiVar, z5 z5Var, d6 d6Var, c6 c6Var, y5 y5Var, z6 z6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = wiVar;
        this.f = w5Var;
        this.g = x5Var;
        this.h = yiVar;
        this.i = z5Var;
        this.j = d6Var;
        this.k = c6Var;
        this.l = y5Var;
        this.m = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return k71.k.b(this.a, e6Var.a) && k71.k.b(this.b, e6Var.b) && k71.k.b(this.c, e6Var.c) && this.d == e6Var.d && this.e == e6Var.e && k71.k.b(this.f, e6Var.f) && k71.k.b(this.g, e6Var.g) && this.h == e6Var.h && k71.k.b(this.i, e6Var.i) && k71.k.b(this.j, e6Var.j) && k71.k.b(this.k, e6Var.k) && k71.k.b(this.l, e6Var.l) && k71.k.b(this.m, e6Var.m);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31)) * 31;
        x5 x5Var = this.g;
        int hashCode2 = (hashCode + (x5Var == null ? 0 : Integer.hashCode(x5Var.a))) * 31;
        yi yiVar = this.h;
        int hashCode3 = (hashCode2 + (yiVar == null ? 0 : yiVar.hashCode())) * 31;
        z5 z5Var = this.i;
        int hashCode4 = (this.j.hashCode() + ((hashCode3 + (z5Var == null ? 0 : z5Var.hashCode())) * 31)) * 31;
        c6 c6Var = this.k;
        int hashCode5 = (hashCode4 + (c6Var == null ? 0 : c6Var.hashCode())) * 31;
        y5 y5Var = this.l;
        return this.m.hashCode() + ((hashCode5 + (y5Var != null ? y5Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SubIssueFragment(__typename=", this.a, ", id=", this.b, ", titleHTML=");
        a0.s0.w(this.d, this.c, ", number=", ", issueState=", o);
        o.append(this.e);
        o.append(", assignedActors=");
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
        o.append(", duplicateOf=");
        o.append(this.l);
        o.append(", subIssueProgressFragment=");
        o.append(this.m);
        o.append(")");
        return o.toString();
    }
}
