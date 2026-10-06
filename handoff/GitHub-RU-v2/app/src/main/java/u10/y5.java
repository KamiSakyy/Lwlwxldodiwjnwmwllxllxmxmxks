package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y5 {
    public final String a;
    public final String b;
    public final g40.e1 c;

    public y5(String str, String str2, g40.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return k71.k.b(this.a, y5Var.a) && k71.k.b(this.b, y5Var.b) && k71.k.b(this.c, y5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Commit(__typename=", this.a, ", id=", this.b, ", commitDiffEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
