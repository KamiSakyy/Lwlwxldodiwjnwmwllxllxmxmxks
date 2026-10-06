package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u30 {
    public String a;
    public String b;
    public uu0.z4 c;

    public u30(String str, String str2, uu0.z4 z4Var) {
        this.a = str;
        this.b = str2;
        this.c = z4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj;
        return k71.k.b(this.a, u30Var.a) && k71.k.b(this.b, u30Var.b) && k71.k.b(this.c, u30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRepository(__typename=", this.a, ", id=", this.b, ", simpleRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
