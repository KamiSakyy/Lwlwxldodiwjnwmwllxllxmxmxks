package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lr {
    public final String a;
    public final String b;
    public final er.e1 c;

    public lr(String str, String str2, er.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr)) {
            return false;
        }
        lr lrVar = (lr) obj;
        return k71.k.b(this.a, lrVar.a) && k71.k.b(this.b, lrVar.b) && k71.k.b(this.c, lrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitDiffEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
