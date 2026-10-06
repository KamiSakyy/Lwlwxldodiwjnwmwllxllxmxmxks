package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t40 {
    public final String a;
    public final String b;
    public final bl0.a c;

    public t40(String str, String str2, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40)) {
            return false;
        }
        t40 t40Var = (t40) obj;
        return k71.k.b(this.a, t40Var.a) && k71.k.b(this.b, t40Var.b) && k71.k.b(this.c, t40Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        bl0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return jo.f4.q(a0.s0.o("Owner(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
