package f00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.h0 {
    public final String a;
    public final String b;
    public final f0 c;

    public g0(String str, String str2, f0 f0Var) {
        this.a = str;
        this.b = str2;
        this.c = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2RelatedProjectsIssue(__typename=", this.a, ", id=", this.b, ", projectsV2=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
