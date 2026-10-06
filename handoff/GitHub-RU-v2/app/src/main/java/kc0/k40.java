package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k40 {
    public final String a;
    public final String b;
    public final bl0.a c;

    public k40(String str, String str2, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return k71.k.b(this.a, k40Var.a) && k71.k.b(this.b, k40Var.b) && k71.k.b(this.c, k40Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        bl0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return jo.f4.q(a0.s0.o("AnswerChosenBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
