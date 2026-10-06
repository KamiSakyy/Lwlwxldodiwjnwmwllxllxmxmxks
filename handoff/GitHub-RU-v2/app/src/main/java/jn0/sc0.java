package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sc0 {
    public final String a;
    public final String b;
    public final String c;

    public sc0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc0)) {
            return false;
        }
        sc0 sc0Var = (sc0) obj;
        return k71.k.b(this.a, sc0Var.a) && k71.k.b(this.b, sc0Var.b) && k71.k.b(this.c, sc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", login="), this.c, ")");
    }
}
