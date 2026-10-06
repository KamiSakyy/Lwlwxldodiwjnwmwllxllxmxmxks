package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kz {
    public final String a;
    public final String b;
    public final xt0.p2 c;

    public kz(String str, String str2, xt0.p2 p2Var) {
        this.a = str;
        this.b = str2;
        this.c = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return k71.k.b(this.a, kzVar.a) && k71.k.b(this.b, kzVar.b) && k71.k.b(this.c, kzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
