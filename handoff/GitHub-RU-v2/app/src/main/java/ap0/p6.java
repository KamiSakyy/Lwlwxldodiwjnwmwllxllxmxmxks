package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p6 implements aa.h0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final n6 e;
    public final j6 f;
    public final String g;

    public p6(String str, String str2, int i, String str3, n6 n6Var, j6 j6Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = n6Var;
        this.f = j6Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return k71.k.b(this.a, p6Var.a) && k71.k.b(this.b, p6Var.b) && this.c == p6Var.c && k71.k.b(this.d, p6Var.d) && k71.k.b(this.e, p6Var.e) && k71.k.b(this.f, p6Var.f) && k71.k.b(this.g, p6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WidgetPullRequestRowFragment(id=", this.a, ", title=", this.b, ", number=");
        x.i.r(this.c, ", url=", this.d, ", repository=", o);
        o.append(this.e);
        o.append(", commits=");
        o.append(this.f);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.g, ")");
    }
}
