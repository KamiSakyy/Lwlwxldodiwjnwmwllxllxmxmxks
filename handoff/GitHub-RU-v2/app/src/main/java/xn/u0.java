package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public u0(String str, String str2, String str3, String str4) {
        k71.k.g(str, "type");
        k71.k.g(str2, "uiType");
        k71.k.g(str3, "uiDescription");
        k71.k.g(str4, "description");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && k71.k.b(this.b, u0Var.b) && k71.k.b(this.c, u0Var.c) && k71.k.b(this.d, u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("CodeVulnerabilityDetails(type=", this.a, ", uiType=", this.b, ", uiDescription="), this.c, ", description=", this.d, ")");
    }
}
