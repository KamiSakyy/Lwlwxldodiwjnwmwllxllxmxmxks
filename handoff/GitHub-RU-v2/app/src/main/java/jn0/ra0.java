package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ra0 {
    public String a;
    public String b;
    public kw0.a c;

    public ra0(String str, String str2, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0Var = (ra0) obj;
        return k71.k.b(this.a, ra0Var.a) && k71.k.b(this.b, ra0Var.b) && k71.k.b(this.c, ra0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kw0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f1.e.n(a0.s0.o("Actor(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
