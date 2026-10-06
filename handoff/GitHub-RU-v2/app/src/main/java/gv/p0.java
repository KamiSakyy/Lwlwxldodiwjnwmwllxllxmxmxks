package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public final String a;
    public final String b;
    public final d1 c;

    public p0(String str, String str2, d1 d1Var) {
        this.a = str;
        this.b = str2;
        this.c = d1Var;
    }

    public static p0 a(p0 p0Var, d1 d1Var) {
        String str = p0Var.a;
        String str2 = p0Var.b;
        p0Var.getClass();
        return new p0(str, str2, d1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Diff(baseCommitOid=", this.a, ", headCommitOid=", this.b, ", patches=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
