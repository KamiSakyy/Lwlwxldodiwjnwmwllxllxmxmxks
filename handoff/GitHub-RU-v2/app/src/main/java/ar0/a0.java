package ar0;

import pz0.f40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0Shadow implements aa.h0 {
    public String a;
    public String b;
    public z c;
    public String d;
    public String e;
    public f40 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public p0 k;
    public gu0.c l;
    public gt0.a m;

    public Object a0(String str, String str2, z zVar, String str3, String str4, f40 f40Var, boolean z, boolean z2, boolean z3, boolean z4, p0 p0Var, gu0.c cVar, gt0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = zVar;
        this.d = str3;
        this.e = str4;
        this.f = f40Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = p0Var;
        this.l = cVar;
        this.m = aVar;
    }

    public static a0 a(a0Shadow a0Var, p0 p0Var, gt0.a aVar, int i) {
        String str = a0Var.a;
        String str2 = a0Var.b;
        z zVar = a0Var.c;
        String str3 = a0Var.d;
        String str4 = a0Var.e;
        f40 f40Var = a0Var.f;
        boolean z = a0Var.g;
        boolean z2 = a0Var.h;
        boolean z3 = a0Var.i;
        boolean z4 = a0Var.j;
        p0 p0Var2 = (i & 1024) != 0 ? a0Var.k : p0Var;
        gu0.c cVar = a0Var.l;
        gt0.a aVar2 = (i & 4096) != 0 ? a0Var.m : aVar;
        a0Var.getClass();
        return new a0Shadow(str, str2, zVar, str3, str4, f40Var, z, z2, z3, z4, p0Var2, cVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0Shadow)) {
            return false;
        }
        a0Shadow a0Var = (a0Shadow) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b) && k71.k.b(this.c, a0Var.c) && k71.k.b(this.d, a0Var.d) && k71.k.b(this.e, a0Var.e) && this.f == a0Var.f && this.g == a0Var.g && this.h == a0Var.h && this.i == a0Var.i && this.j == a0Var.j && k71.k.b(this.k, a0Var.k) && k71.k.b(this.l, a0Var.l) && k71.k.b(this.m, a0Var.m);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31);
        f40 f40Var = this.f;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e((i + (f40Var == null ? 0 : f40Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31);
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
