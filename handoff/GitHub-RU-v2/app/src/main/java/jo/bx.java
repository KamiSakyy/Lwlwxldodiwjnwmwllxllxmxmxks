package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bx {
    public final String a;
    public final String b;
    public final cq.v4 c;

    public bx(String str, String str2, cq.v4 v4Var) {
        this.a = str;
        this.b = str2;
        this.c = v4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return k71.k.b(this.a, bxVar.a) && k71.k.b(this.b, bxVar.b) && k71.k.b(this.c, bxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repoFileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
