package gv;

import java.util.List;
import m10.wr;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 {
    public int a;
    public int b;
    public a1 c;
    public w0 d;
    public List e;
    public boolean f;
    public boolean g;
    public boolean h;
    public wr i;
    public String j;
    public String k;

    public z0(int i, int i2, a1 a1Var, w0 w0Var, List list, boolean z, boolean z2, boolean z3, wr wrVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = a1Var;
        this.d = w0Var;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = wrVar;
        this.j = str;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.a == z0Var.a && this.b == z0Var.b && k71.k.b(this.c, z0Var.c) && k71.k.b(this.d, z0Var.d) && k71.k.b(this.e, z0Var.e) && this.f == z0Var.f && this.g == z0Var.g && this.h == z0Var.h && this.i == z0Var.i && k71.k.b(this.j, z0Var.j) && k71.k.b(this.k, z0Var.k);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
        a1 a1Var = this.c;
        int hashCode = (b + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        w0 w0Var = this.d;
        int hashCode2 = (hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
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
