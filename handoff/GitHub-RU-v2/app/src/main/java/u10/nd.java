package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nd {
    public String a;
    public String b;
    public g40.l1 c;

    public nd(String str, String str2, g40.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj;
        return k71.k.b(this.a, ndVar.a) && k71.k.b(this.b, ndVar.b) && k71.k.b(this.c, ndVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
