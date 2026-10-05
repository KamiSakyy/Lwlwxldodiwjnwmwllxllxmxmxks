package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final g8 e;
    public final dw.e6 f;

    public f8(String str, String str2, String str3, int i, g8 g8Var, dw.e6 e6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = g8Var;
        this.f = e6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return k71.k.b(this.a, f8Var.a) && k71.k.b(this.b, f8Var.b) && k71.k.b(this.c, f8Var.c) && this.d == f8Var.d && k71.k.b(this.e, f8Var.e) && k71.k.b(this.f, f8Var.f);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        g8 g8Var = this.e;
        return this.f.hashCode() + ((b + (g8Var == null ? 0 : g8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        a0.s0.w(this.d, this.c, ", number=", ", parent=", o);
        o.append(this.e);
        o.append(", subIssueFragment=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
