package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x6 {
    public final String a;
    public final String b;
    public final u80.c c;

    public x6(String str, String str2, u80.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return k71.k.b(this.a, x6Var.a) && k71.k.b(this.b, x6Var.b) && k71.k.b(this.c, x6Var.c);
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
