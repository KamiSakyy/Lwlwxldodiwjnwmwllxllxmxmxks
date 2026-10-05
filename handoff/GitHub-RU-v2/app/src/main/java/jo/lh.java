package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lh {
    public final String a;
    public final String b;
    public final qx.c1 c;

    public lh(String str, String str2, qx.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) obj;
        return k71.k.b(this.a, lhVar.a) && k71.k.b(this.b, lhVar.b) && k71.k.b(this.c, lhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
