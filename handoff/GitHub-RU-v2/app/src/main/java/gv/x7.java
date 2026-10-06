package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final w7 d;
    public final boolean e;
    public final boolean f;
    public final u7 g;
    public final nv.a h;

    public x7(String str, String str2, boolean z, w7 w7Var, boolean z2, boolean z3, u7 u7Var, nv.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = w7Var;
        this.e = z2;
        this.f = z3;
        this.g = u7Var;
        this.h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return k71.k.b(this.a, x7Var.a) && k71.k.b(this.b, x7Var.b) && this.c == x7Var.c && k71.k.b(this.d, x7Var.d) && this.e == x7Var.e && this.f == x7Var.f && k71.k.b(this.g, x7Var.g) && k71.k.b(this.h, x7Var.h);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        w7 w7Var = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + x.i.e(x.i.e((e + (w7Var == null ? 0 : w7Var.hashCode())) * 31, 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Thread(__typename=", this.a, ", id=", this.b, ", isResolved=");
        o.append(this.c);
        o.append(", resolvedBy=");
        o.append(this.d);
        o.append(", viewerCanResolve=");
        com.github.rudroid.m0.A(o, this.e, ", viewerCanUnresolve=", this.f, ", positioning=");
        o.append(this.g);
        o.append(", multiLineCommentFields=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
