package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c9 {
    public String a;
    public String b;
    public ri0.e c;

    public c9(String str, String str2, ri0.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return k71.k.b(this.a, c9Var.a) && k71.k.b(this.b, c9Var.b) && k71.k.b(this.c, c9Var.c);
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
