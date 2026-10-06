package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i10 {
    public String a;
    public boolean b;
    public String c;
    public oj0.v3 d;

    public i10(String str, boolean z, String str2, oj0.v3 v3Var) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return k71.k.b(this.a, i10Var.a) && this.b == i10Var.b && k71.k.b(this.c, i10Var.c) && k71.k.b(this.d, i10Var.d);
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
