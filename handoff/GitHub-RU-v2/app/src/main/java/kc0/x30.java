package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x30 {
    public String a;
    public String b;
    public sd0.q c;

    public x30(String str, String str2, sd0.q qVar) {
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x30)) {
            return false;
        }
        x30 x30Var = (x30) obj;
        return k71.k.b(this.a, x30Var.a) && k71.k.b(this.b, x30Var.b) && k71.k.b(this.c, x30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", followUserFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
