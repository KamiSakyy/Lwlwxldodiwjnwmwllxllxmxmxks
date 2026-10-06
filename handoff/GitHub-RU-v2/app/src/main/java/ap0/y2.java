package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y2 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public x2 g;
    public w2 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public cp0.g l;

    public y2(String str, String str2, String str3, String str4, String str5, String str6, x2 x2Var, w2 w2Var, boolean z, boolean z2, boolean z3, cp0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = x2Var;
        this.h = w2Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.a, y2Var.a) && k71.k.b(this.b, y2Var.b) && k71.k.b(this.c, y2Var.c) && k71.k.b(this.d, y2Var.d) && k71.k.b(this.e, y2Var.e) && k71.k.b(this.f, y2Var.f) && k71.k.b(this.g, y2Var.g) && k71.k.b(this.h, y2Var.h) && this.i == y2Var.i && this.j == y2Var.j && this.k == y2Var.k && k71.k.b(this.l, y2Var.l);
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
