package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 {
    public String a;
    public String b;
    public boolean c;
    public t1 d;
    public boolean e;
    public boolean f;
    public r1 g;
    public List h;
    public j1 i;
    public nv.a j;

    public u1(String str, String str2, boolean z, t1 t1Var, boolean z2, boolean z3, r1 r1Var, List list, j1 j1Var, nv.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = t1Var;
        this.e = z2;
        this.f = z3;
        this.g = r1Var;
        this.h = list;
        this.i = j1Var;
        this.j = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b) && this.c == u1Var.c && k71.k.b(this.d, u1Var.d) && this.e == u1Var.e && this.f == u1Var.f && k71.k.b(this.g, u1Var.g) && k71.k.b(this.h, u1Var.h) && k71.k.b(this.i, u1Var.i) && k71.k.b(this.j, u1Var.j);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        t1 t1Var = this.d;
        int hashCode = (this.g.hashCode() + x.i.e(x.i.e((e + (t1Var == null ? 0 : t1Var.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
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
