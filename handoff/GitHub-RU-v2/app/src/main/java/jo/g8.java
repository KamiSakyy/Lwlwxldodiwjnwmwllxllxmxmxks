package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g8 {
    public final String a;
    public final String b;
    public final dw.z6 c;

    public g8(String str, String str2, dw.z6 z6Var) {
        this.a = str;
        this.b = str2;
        this.c = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        return k71.k.b(this.a, g8Var.a) && k71.k.b(this.b, g8Var.b) && k71.k.b(this.c, g8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Parent(__typename=", this.a, ", id=", this.b, ", subIssueProgressFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
