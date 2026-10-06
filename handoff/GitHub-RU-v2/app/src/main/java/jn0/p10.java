package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p10 {
    public String a;
    public String b;
    public uu0.i2 c;

    public p10(String str, String str2, uu0.i2 i2Var) {
        this.a = str;
        this.b = str2;
        this.c = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p10)) {
            return false;
        }
        p10 p10Var = (p10) obj;
        return k71.k.b(this.a, p10Var.a) && k71.k.b(this.b, p10Var.b) && k71.k.b(this.c, p10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
