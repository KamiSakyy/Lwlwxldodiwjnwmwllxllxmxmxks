package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f5 {
    public String a;
    public String b;
    public cp0.c c;

    public f5(String str, String str2, cp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return k71.k.b(this.a, f5Var.a) && k71.k.b(this.b, f5Var.b) && k71.k.b(this.c, f5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f1.e.m(a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", actorFields="), this.c, ")");
    }
}
