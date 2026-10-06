package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x60 {
    public String a;
    public boolean b;
    public String c;
    public dw.t5 d;

    public x60(String str, boolean z, String str2, dw.t5 t5Var) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        x60 x60Var = (x60) obj;
        return k71.k.b(this.a, x60Var.a) && this.b == x60Var.b && k71.k.b(this.c, x60Var.c) && k71.k.b(this.d, x60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Node(__typename=", this.a, ", isArchived=", ", id=", this.b);
        o.append(this.c);
        o.append(", simpleRepositoryFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
