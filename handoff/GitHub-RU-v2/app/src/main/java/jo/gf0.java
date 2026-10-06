package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gf0 {
    public String a;
    public String b;
    public String c;

    public gf0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj;
        return k71.k.b(this.a, gf0Var.a) && k71.k.b(this.b, gf0Var.b) && k71.k.b(this.c, gf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", login="), this.c, ")");
    }
}
