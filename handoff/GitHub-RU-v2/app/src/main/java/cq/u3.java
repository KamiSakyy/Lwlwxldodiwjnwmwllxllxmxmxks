package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u3 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final t3 g;
    public final s3 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final eq.g l;

    public u3(String str, String str2, String str3, String str4, String str5, String str6, t3 t3Var, s3 s3Var, boolean z, boolean z2, boolean z3, eq.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = t3Var;
        this.h = s3Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return k71.k.b(this.a, u3Var.a) && k71.k.b(this.b, u3Var.b) && k71.k.b(this.c, u3Var.c) && k71.k.b(this.d, u3Var.d) && k71.k.b(this.e, u3Var.e) && k71.k.b(this.f, u3Var.f) && k71.k.b(this.g, u3Var.g) && k71.k.b(this.h, u3Var.h) && this.i == u3Var.i && this.j == u3Var.j && this.k == u3Var.k && k71.k.b(this.l, u3Var.l);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int i2 = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31);
        String str2 = this.f;
        return this.l.hashCode() + x.i.e(x.i.e(x.i.e(a0.s0.b(this.h.a, a0.s0.b(this.g.a, (i2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RecommendedUserFeedFragment(__typename=", this.a, ", id=", this.b, ", name=");
        f1.e.x(o, this.c, ", login=", this.d, ", url=");
        f1.e.x(o, this.e, ", bio=", this.f, ", repositories=");
        o.append(this.g);
        o.append(", followers=");
        o.append(this.h);
        o.append(", viewerIsFollowing=");
        com.github.rudroid.m0.A(o, this.i, ", isViewer=", this.j, ", privateProfile=");
        o.append(this.k);
        o.append(", avatarFragment=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }

    public Object i;

    public Object e;
}
