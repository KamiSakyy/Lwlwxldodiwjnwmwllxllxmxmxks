package gv;

import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 implements aa.h0 {
    public final String a;
    public final b00 b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final d2 g;
    public final boolean h;
    public final String i;

    public e2(String str, b00 b00Var, String str2, String str3, int i, boolean z, d2 d2Var, boolean z2, String str4) {
        this.a = str;
        this.b = b00Var;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = d2Var;
        this.h = z2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && this.b == e2Var.b && k71.k.b(this.c, e2Var.c) && k71.k.b(this.d, e2Var.d) && this.e == e2Var.e && this.f == e2Var.f && k71.k.b(this.g, e2Var.g) && this.h == e2Var.h && k71.k.b(this.i, e2Var.i);
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
