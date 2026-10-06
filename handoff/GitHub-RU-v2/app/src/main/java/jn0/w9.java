package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w9 {
    public String a;
    public String b;
    public xt0.e c;

    public w9(String str, String str2, xt0.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return k71.k.b(this.a, w9Var.a) && k71.k.b(this.b, w9Var.b) && k71.k.b(this.c, w9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node3(__typename=", this.a, ", id=", this.b, ", deploymentReviewAssociatedPr=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
