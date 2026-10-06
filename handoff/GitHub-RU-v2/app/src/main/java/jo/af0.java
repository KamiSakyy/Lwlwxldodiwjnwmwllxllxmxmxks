package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class af0 {
    public String a;
    public String b;
    public vx.a c;

    public af0(String str, String str2, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return k71.k.b(this.a, af0Var.a) && k71.k.b(this.b, af0Var.b) && k71.k.b(this.c, af0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        vx.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.r(a0.s0.o("Actor(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
    public af0(String p1, String p2, Object p3) {
    }
}
