package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l7 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public String d;
    public j7 e;
    public f7 f;
    public String g;

    public l7(String str, String str2, int i, String str3, j7 j7Var, f7 f7Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = j7Var;
        this.f = f7Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return k71.k.b(this.a, l7Var.a) && k71.k.b(this.b, l7Var.b) && this.c == l7Var.c && k71.k.b(this.d, l7Var.d) && k71.k.b(this.e, l7Var.e) && k71.k.b(this.f, l7Var.f) && k71.k.b(this.g, l7Var.g);
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
