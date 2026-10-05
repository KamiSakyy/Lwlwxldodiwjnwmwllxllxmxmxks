package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 {
    public final String a;
    public final String b;
    public final t2 c;
    public final s2 d;

    public r2(String str, String str2, t2 t2Var, s2 s2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = t2Var;
        this.d = s2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && k71.k.b(this.b, r2Var.b) && k71.k.b(this.c, r2Var.c) && k71.k.b(this.d, r2Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        t2 t2Var = this.c;
        int hashCode = (i + (t2Var == null ? 0 : t2Var.a.hashCode())) * 31;
        s2 s2Var = this.d;
        return hashCode + (s2Var != null ? s2Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepositoryNode=");
        o.append(this.c);
        o.append(", onAssignable=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
