package vo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 {
    public final String a;
    public final String b;
    public final String c;

    public y2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.a, y2Var.a) && k71.k.b(this.b, y2Var.b) && k71.k.b(this.c, y2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Workflow(id=", this.a, ", name=", this.b, ", __typename="), this.c, ")");
    }
}
