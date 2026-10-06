package uf0;

import gn0.kw;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 implements aa.h0 {
    public String a;
    public String b;
    public z c;
    public String d;
    public String e;
    public kw f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public p0 k;
    public aj0.c l;
    public yh0.a m;

    public a0(String str, String str2, z zVar, String str3, String str4, kw kwVar, boolean z, boolean z2, boolean z3, boolean z4, p0 p0Var, aj0.c cVar, yh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = zVar;
        this.d = str3;
        this.e = str4;
        this.f = kwVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = p0Var;
        this.l = cVar;
        this.m = aVar;
    }

    public static a0 a(a0 a0Var, p0 p0Var, yh0.a aVar, int i) {
        String str = a0Var.a;
        String str2 = a0Var.b;
        z zVar = a0Var.c;
        String str3 = a0Var.d;
        String str4 = a0Var.e;
        kw kwVar = a0Var.f;
        boolean z = a0Var.g;
        boolean z2 = a0Var.h;
        boolean z3 = a0Var.i;
        boolean z4 = a0Var.j;
        p0 p0Var2 = (i & 1024) != 0 ? a0Var.k : p0Var;
        aj0.c cVar = a0Var.l;
        yh0.a aVar2 = (i & 4096) != 0 ? a0Var.m : aVar;
        a0Var.getClass();
        return new a0(str, str2, zVar, str3, str4, kwVar, z, z2, z3, z4, p0Var2, cVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && k71.k.b(this.c, a0Var.c) && k71.k.b(this.d, a0Var.d) && k71.k.b(this.e, a0Var.e) && this.f == a0Var.f && this.g == a0Var.g && this.h == a0Var.h && this.i == a0Var.i && this.j == a0Var.j && k71.k.b(this.k, a0Var.k) && k71.k.b(this.l, a0Var.l) && k71.k.b(this.m, a0Var.m);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31);
        kw kwVar = this.f;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e((i + (kwVar == null ? 0 : kwVar.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionDetailsFragment(__typename=", this.a, ", id=", this.b, ", repository=");
        o.append(this.c);
        o.append(", bodyHTML=");
        o.append(this.d);
        o.append(", body=");
        o.append(this.e);
        o.append(", viewerSubscription=");
        o.append(this.f);
        o.append(", locked=");
        com.github.rudroid.m0.A(o, this.g, ", viewerCanDelete=", this.h, ", viewerCanUpdate=");
        com.github.rudroid.m0.A(o, this.i, ", viewerCanUpvote=", this.j, ", discussionFragment=");
        o.append(this.k);
        o.append(", reactionFragment=");
        o.append(this.l);
        o.append(", orgBlockableFragment=");
        o.append(this.m);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
