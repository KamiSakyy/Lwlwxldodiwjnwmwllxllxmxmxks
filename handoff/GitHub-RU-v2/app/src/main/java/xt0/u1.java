package xt0;

import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 implements aa.h0 {
    public final String a;
    public final gu b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final t1 g;
    public final boolean h;
    public final String i;

    public u1(String str, gu guVar, String str2, String str3, int i, boolean z, t1 t1Var, boolean z2, String str4) {
        this.a = str;
        this.b = guVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = t1Var;
        this.h = z2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && this.b == u1Var.b && k71.k.b(this.c, u1Var.c) && k71.k.b(this.d, u1Var.d) && this.e == u1Var.e && this.f == u1Var.f && k71.k.b(this.g, u1Var.g) && this.h == u1Var.h && k71.k.b(this.i, u1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + x.i.e((this.g.hashCode() + x.i.e(a0.s0.b(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31), 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedPullRequestFragment(id=");
        sb.append(this.a);
        sb.append(", pullRequestState=");
        sb.append(this.b);
        sb.append(", title=");
        f1.e.x(sb, this.c, ", url=", this.d, ", number=");
        com.github.rudroid.m0.w(sb, this.e, ", isDraft=", this.f, ", repository=");
        sb.append(this.g);
        sb.append(", isInMergeQueue=");
        sb.append(this.h);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.i, ")");
    }
}
