package ap0;

import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public gu h;
    public boolean i;
    public int j;
    public q2 k;
    public gu0.c l;

    public r2(String str, String str2, String str3, String str4, String str5, String str6, String str7, gu guVar, boolean z, int i, q2 q2Var, gu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = guVar;
        this.i = z;
        this.j = i;
        this.k = q2Var;
        this.l = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && k71.k.b(this.b, r2Var.b) && k71.k.b(this.c, r2Var.c) && k71.k.b(this.d, r2Var.d) && k71.k.b(this.e, r2Var.e) && k71.k.b(this.f, r2Var.f) && k71.k.b(this.g, r2Var.g) && this.h == r2Var.h && this.i == r2Var.i && this.j == r2Var.j && k71.k.b(this.k, r2Var.k) && k71.k.b(this.l, r2Var.l);
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
