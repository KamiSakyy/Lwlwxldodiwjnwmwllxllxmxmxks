package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g4 {
    public String a;
    public String b;
    public String c;

    public g4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return k71.k.b(this.a, g4Var.a) && k71.k.b(this.b, g4Var.b) && k71.k.b(this.c, g4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("App(logoUrl=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
