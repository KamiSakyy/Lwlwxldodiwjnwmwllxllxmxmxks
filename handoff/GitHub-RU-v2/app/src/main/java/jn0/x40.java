package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x40 {
    public String a;
    public boolean b;
    public String c;
    public uu0.z4 d;

    public x40(String str, boolean z, String str2, uu0.z4 z4Var) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x40)) {
            return false;
        }
        x40 x40Var = (x40) obj;
        return k71.k.b(this.a, x40Var.a) && this.b == x40Var.b && k71.k.b(this.c, x40Var.c) && k71.k.b(this.d, x40Var.d);
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
