package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r9 {
    public String a;
    public String b;
    public cp0.c c;

    public r9(String str, String str2, cp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return k71.k.b(this.a, r9Var.a) && k71.k.b(this.b, r9Var.b) && k71.k.b(this.c, r9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f1.e.m(a0.s0.o("Creator(__typename=", this.a, ", id=", this.b, ", actorFields="), this.c, ")");
    }
}
