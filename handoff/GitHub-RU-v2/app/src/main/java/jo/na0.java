package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class na0 {
    public final String a;
    public final String b;
    public final qa0 c;
    public final vx.a d;

    public na0(String str, String str2, qa0 qa0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = qa0Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return k71.k.b(this.a, na0Var.a) && k71.k.b(this.b, na0Var.b) && k71.k.b(this.c, na0Var.c) && k71.k.b(this.d, na0Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        qa0 qa0Var = this.c;
        int hashCode = (i + (qa0Var == null ? 0 : qa0Var.hashCode())) * 31;
        vx.a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Actor(__typename=", this.a, ", login=", this.b, ", onBot=");
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
