package dw;

import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final r0 e;
    public final yi f;
    public final wi g;
    public final o0 h;
    public final String i;

    public q0(String str, String str2, String str3, int i, r0 r0Var, yi yiVar, wi wiVar, o0 o0Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = r0Var;
        this.f = yiVar;
        this.g = wiVar;
        this.h = o0Var;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && k71.k.b(this.c, q0Var.c) && this.d == q0Var.d && k71.k.b(this.e, q0Var.e) && this.f == q0Var.f && this.g == q0Var.g && k71.k.b(this.h, q0Var.h) && k71.k.b(this.i, q0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31;
        yi yiVar = this.f;
        int hashCode2 = (this.g.hashCode() + ((hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31)) * 31;
        o0 o0Var = this.h;
        return this.i.hashCode() + ((hashCode2 + (o0Var != null ? o0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Parent(id=", this.a, ", title=", this.b, ", titleHTML=");
        a0.s0.w(this.d, this.c, ", number=", ", repository=", o);
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", state=");
        o.append(this.g);
        o.append(", duplicateOf=");
        o.append(this.h);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.i, ")");
    }
}
