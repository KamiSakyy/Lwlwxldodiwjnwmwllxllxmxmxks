package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j7 {
    public String a;
    public String b;
    public boolean c;
    public i7 d;
    public boolean e;
    public boolean f;
    public List g;
    public eu0.a h;

    public j7(String str, String str2, boolean z, i7 i7Var, boolean z2, boolean z3, List list, eu0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i7Var;
        this.e = z2;
        this.f = z3;
        this.g = list;
        this.h = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return k71.k.b(this.a, j7Var.a) && k71.k.b(this.b, j7Var.b) && this.c == j7Var.c && k71.k.b(this.d, j7Var.d) && this.e == j7Var.e && this.f == j7Var.f && k71.k.b(this.g, j7Var.g) && k71.k.b(this.h, j7Var.h);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        i7 i7Var = this.d;
        int e2 = x.i.e(x.i.e((e + (i7Var == null ? 0 : i7Var.hashCode())) * 31, 31, this.e), 31, this.f);
        List list = this.g;
        return this.h.hashCode() + ((e2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Thread(__typename=", this.a, ", id=", this.b, ", isResolved=");
        o.append(this.c);
        o.append(", resolvedBy=");
        o.append(this.d);
        o.append(", viewerCanResolve=");
        com.github.rudroid.m0.A(o, this.e, ", viewerCanUnresolve=", this.f, ", diffLines=");
        o.append(this.g);
        o.append(", multiLineCommentFields=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
