package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final o1 d;
    public final boolean e;
    public final boolean f;
    public final m1 g;
    public final List h;
    public final e1 i;
    public final eu0.a j;

    public p1(String str, String str2, boolean z, o1 o1Var, boolean z2, boolean z3, m1 m1Var, List list, e1 e1Var, eu0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = o1Var;
        this.e = z2;
        this.f = z3;
        this.g = m1Var;
        this.h = list;
        this.i = e1Var;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return k71.k.b(this.a, p1Var.a) && k71.k.b(this.b, p1Var.b) && this.c == p1Var.c && k71.k.b(this.d, p1Var.d) && this.e == p1Var.e && this.f == p1Var.f && k71.k.b(this.g, p1Var.g) && k71.k.b(this.h, p1Var.h) && k71.k.b(this.i, p1Var.i) && k71.k.b(this.j, p1Var.j);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        o1 o1Var = this.d;
        int hashCode = (this.g.hashCode() + x.i.e(x.i.e((e + (o1Var == null ? 0 : o1Var.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
        List list = this.h;
        int hashCode2 = list != null ? list.hashCode() : 0;
        return this.j.hashCode() + ((this.i.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Thread(__typename=", this.a, ", id=", this.b, ", isResolved=");
        o.append(this.c);
        o.append(", resolvedBy=");
        o.append(this.d);
        o.append(", viewerCanResolve=");
        com.github.rudroid.m0.A(o, this.e, ", viewerCanUnresolve=", this.f, ", pullRequest=");
        o.append(this.g);
        o.append(", diffLines=");
        o.append(this.h);
        o.append(", comments=");
        o.append(this.i);
        o.append(", multiLineCommentFields=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
