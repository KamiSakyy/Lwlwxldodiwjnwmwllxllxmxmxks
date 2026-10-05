package uf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 {
    public final String a;
    public final String b;
    public final ag0.i c;

    public m0(String str, String str2, ag0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Poll(__typename=", this.a, ", id=", this.b, ", discussionPollFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
