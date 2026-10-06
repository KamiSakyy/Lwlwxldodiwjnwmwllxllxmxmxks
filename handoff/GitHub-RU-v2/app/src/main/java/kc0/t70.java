package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t70 {
    public String a;
    public String b;
    public bl0.a c;

    public t70(String str, String str2, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        return k71.k.b(this.a, t70Var.a) && k71.k.b(this.b, t70Var.b) && k71.k.b(this.c, t70Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        bl0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return jo.f4.q(a0.s0.o("MergedBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
