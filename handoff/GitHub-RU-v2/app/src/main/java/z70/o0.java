package z70;

import hc0.pi;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public final int a;
    public final int b;
    public final p0 c;
    public final l0 d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final pi i;
    public final String j;
    public final String k;

    public o0(int i, int i2, p0 p0Var, l0 l0Var, List list, boolean z, boolean z2, boolean z3, pi piVar, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = p0Var;
        this.d = l0Var;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = piVar;
        this.j = str;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a == o0Var.a && this.b == o0Var.b && k71.k.b(this.c, o0Var.c) && k71.k.b(this.d, o0Var.d) && k71.k.b(this.e, o0Var.e) && this.f == o0Var.f && this.g == o0Var.g && this.h == o0Var.h && this.i == o0Var.i && k71.k.b(this.j, o0Var.j) && k71.k.b(this.k, o0Var.k);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
        p0 p0Var = this.c;
        int hashCode = (b + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        l0 l0Var = this.d;
        int hashCode2 = (hashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
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
