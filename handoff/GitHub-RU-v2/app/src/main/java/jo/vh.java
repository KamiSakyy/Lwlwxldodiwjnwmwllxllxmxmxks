package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vh {
    public String a;
    public String b;
    public cq.g1 c;

    public vh(String str, String str2, cq.g1 g1Var) {
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return k71.k.b(this.a, vhVar.a) && k71.k.b(this.b, vhVar.b) && k71.k.b(this.c, vhVar.c);
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
