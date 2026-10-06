package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ng0 {
    public final String a;
    public final String b;
    public final kt0.q c;

    public ng0(String str, String str2, kt0.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        return k71.k.b(this.a, ng0Var.a) && k71.k.b(this.b, ng0Var.b) && k71.k.b(this.c, ng0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", organizationListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
