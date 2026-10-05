package uu0;

import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final q0 e;
    public final df f;
    public final bf g;
    public final String h;

    public p0(String str, String str2, String str3, int i, q0 q0Var, df dfVar, bf bfVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = q0Var;
        this.f = dfVar;
        this.g = bfVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c) && this.d == p0Var.d && k71.k.b(this.e, p0Var.e) && this.f == p0Var.f && this.g == p0Var.g && k71.k.b(this.h, p0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31;
        df dfVar = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Parent(id=", this.a, ", title=", this.b, ", titleHTML=");
        a0.s0.w(this.d, this.c, ", number=", ", repository=", o);
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", state=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
