package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f7 {
    public String a;
    public String b;
    public er.e1 c;

    public f7(String str, String str2, er.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return k71.k.b(this.a, f7Var.a) && k71.k.b(this.b, f7Var.b) && k71.k.b(this.c, f7Var.c);
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
