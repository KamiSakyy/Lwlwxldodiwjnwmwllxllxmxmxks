package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a6 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final cp0.g e;

    public a6(String str, String str2, String str3, String str4, cp0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && k71.k.b(this.b, a6Var.b) && k71.k.b(this.c, a6Var.c) && k71.k.b(this.d, a6Var.d) && k71.k.b(this.e, a6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserFeedFragment(__typename=", this.a, ", id=", this.b, ", login=");
        f1.e.x(o, this.c, ", url=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
