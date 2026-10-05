package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s8 {
    public final String a;
    public final String b;
    public final zv.c c;

    public s8(String str, String str2, zv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return k71.k.b(this.a, s8Var.a) && k71.k.b(this.b, s8Var.b) && k71.k.b(this.c, s8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Ref(__typename=", this.a, ", id=", this.b, ", repoBranchFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
