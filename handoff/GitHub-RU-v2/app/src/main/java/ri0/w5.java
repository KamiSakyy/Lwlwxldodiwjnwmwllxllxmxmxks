package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w5 {
    public String a;
    public String b;
    public String c;

    public w5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return k71.k.b(this.a, w5Var.a) && k71.k.b(this.b, w5Var.b) && k71.k.b(this.c, w5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Workflow(name=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
