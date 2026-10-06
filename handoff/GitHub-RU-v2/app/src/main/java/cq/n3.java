package cq;

import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final b00 h;
    public final boolean i;
    public final int j;
    public final m3 k;
    public final pv.c l;

    public n3(String str, String str2, String str3, String str4, String str5, String str6, String str7, b00 b00Var, boolean z, int i, m3 m3Var, pv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = b00Var;
        this.i = z;
        this.j = i;
        this.k = m3Var;
        this.l = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return k71.k.b(this.a, n3Var.a) && k71.k.b(this.b, n3Var.b) && k71.k.b(this.c, n3Var.c) && k71.k.b(this.d, n3Var.d) && k71.k.b(this.e, n3Var.e) && k71.k.b(this.f, n3Var.f) && k71.k.b(this.g, n3Var.g) && this.h == n3Var.h && this.i == n3Var.i && this.j == n3Var.j && k71.k.b(this.k, n3Var.k) && k71.k.b(this.l, n3Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + a0.s0.b(this.j, x.i.e((this.h.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31)) * 31, 31, this.i), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestFeedFragment(__typename=", this.a, ", id=", this.b, ", title=");
        f1.e.x(o, this.c, ", bodyHTML=", this.d, ", bodyText=");
        f1.e.x(o, this.e, ", baseRefName=", this.f, ", headRefName=");
        o.append(this.g);
        o.append(", state=");
        o.append(this.h);
        o.append(", isDraft=");
        com.github.rudroid.m0.y(o, this.i, ", number=", this.j, ", repository=");
        o.append(this.k);
        o.append(", reactionFragment=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }

    public Object e;
}
