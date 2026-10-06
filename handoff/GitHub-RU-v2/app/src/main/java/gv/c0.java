package gv;

import m10.xz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public String a;
    public xz b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public d0 h;
    public boolean i;
    public a0Shadow j;
    public nv.a k;

    public c0(String str, xz xzVar, String str2, boolean z, boolean z2, boolean z3, boolean z4, d0 d0Var, boolean z5, a0Shadow a0Var, nv.a aVar) {
        this.a = str;
        this.b = xzVar;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = d0Var;
        this.i = z5;
        this.j = a0Var;
        this.k = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && this.b == c0Var.b && k71.k.b(this.c, c0Var.c) && this.d == c0Var.d && this.e == c0Var.e && this.f == c0Var.f && this.g == c0Var.g && k71.k.b(this.h, c0Var.h) && this.i == c0Var.i && k71.k.b(this.j, c0Var.j) && k71.k.b(this.k, c0Var.k);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        d0 d0Var = this.h;
        return this.k.hashCode() + ((this.j.hashCode() + x.i.e((e + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", subjectType=");
        sb.append(this.b);
        sb.append(", id=");
        com.github.rudroid.m0.x(sb, this.c, ", isResolved=", this.d, ", isOutdated=");
        com.github.rudroid.m0.A(sb, this.e, ", viewerCanResolve=", this.f, ", viewerCanUnresolve=");
        sb.append(this.g);
        sb.append(", resolvedBy=");
        sb.append(this.h);
        sb.append(", viewerCanReply=");
        sb.append(this.i);
        sb.append(", comments=");
        sb.append(this.j);
        sb.append(", multiLineCommentFields=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public Object i;
}
