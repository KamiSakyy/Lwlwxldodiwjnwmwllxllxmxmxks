package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class va0 {
    public String a;
    public String b;
    public vx.a c;

    public va0(String str, String str2, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va0)) {
            return false;
        }
        va0 va0Var = (va0) obj;
        return k71.k.b(this.a, va0Var.a) && k71.k.b(this.b, va0Var.b) && k71.k.b(this.c, va0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        vx.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.r(a0.s0.o("AnswerChosenBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
    public va0(String p1, String p2, Object p3) {
    }
}
