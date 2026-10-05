package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r10 {
    public final String a;
    public final String b;
    public final zv.c c;

    public r10(String str, String str2, zv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r10)) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return k71.k.b(this.a, r10Var.a) && k71.k.b(this.b, r10Var.b) && k71.k.b(this.c, r10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DefaultBranchRef(__typename=", this.a, ", id=", this.b, ", repoBranchFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
