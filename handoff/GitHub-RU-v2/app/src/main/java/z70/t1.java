package z70;

import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.h0 {
    public final String a;
    public final fm b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final s1 g;
    public final String h;

    public t1(String str, fm fmVar, String str2, String str3, int i, boolean z, s1 s1Var, String str4) {
        this.a = str;
        this.b = fmVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = s1Var;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return k71.k.b(this.a, t1Var.a) && this.b == t1Var.b && k71.k.b(this.c, t1Var.c) && k71.k.b(this.d, t1Var.d) && this.e == t1Var.e && this.f == t1Var.f && k71.k.b(this.g, t1Var.g) && k71.k.b(this.h, t1Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + x.i.e(a0.s0.b(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31), 31, this.f)) * 31);
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
        sb.append(", __typename=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
