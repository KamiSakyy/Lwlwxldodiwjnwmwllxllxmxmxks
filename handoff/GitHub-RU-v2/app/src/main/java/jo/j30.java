package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j30 {
    public String a;
    public String b;
    public fu.a c;

    public j30(String str, String str2, fu.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30Var = (j30) obj;
        return k71.k.b(this.a, j30Var.a) && k71.k.b(this.b, j30Var.b) && k71.k.b(this.c, j30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", milestoneFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
