package xt0;

import java.util.List;
import pz0.rm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 {
    public final int a;
    public final int b;
    public final q0 c;
    public final m0 d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final rm i;
    public final String j;
    public final String k;

    public p0(int i, int i2, q0 q0Var, m0 m0Var, List list, boolean z, boolean z2, boolean z3, rm rmVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = q0Var;
        this.d = m0Var;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = rmVar;
        this.j = str;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.a == p0Var.a && this.b == p0Var.b && k71.k.b(this.c, p0Var.c) && k71.k.b(this.d, p0Var.d) && k71.k.b(this.e, p0Var.e) && this.f == p0Var.f && this.g == p0Var.g && this.h == p0Var.h && this.i == p0Var.i && k71.k.b(this.j, p0Var.j) && k71.k.b(this.k, p0Var.k);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
        q0 q0Var = this.c;
        int hashCode = (b + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        m0 m0Var = this.d;
        int hashCode2 = (hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        List list = this.e;
        return this.k.hashCode() + com.github.rudroid.copilot.h1.i((this.i.hashCode() + x.i.e(x.i.e(x.i.e((hashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31, this.j, 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Node(linesAdded=", ", linesDeleted=", ", oldTreeEntry=");
        m.append(this.c);
        m.append(", newTreeEntry=");
        m.append(this.d);
        m.append(", diffLines=");
        com.github.rudroid.copilot.h1.C(m, this.e, ", isBinary=", this.f, ", isLargeDiff=");
        com.github.rudroid.m0.A(m, this.g, ", isSubmodule=", this.h, ", status=");
        m.append(this.i);
        m.append(", id=");
        m.append(this.j);
        m.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(m, this.k, ")");
    }
}
