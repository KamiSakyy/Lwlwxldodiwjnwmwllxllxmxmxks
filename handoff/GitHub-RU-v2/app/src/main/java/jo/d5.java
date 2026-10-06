package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d5 {
    public final String a;
    public final String b;
    public final String c;

    public d5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return k71.k.b(this.a, d5Var.a) && k71.k.b(this.b, d5Var.b) && k71.k.b(this.c, d5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Repository(id=", this.a, ", url=", this.b, ", __typename="), this.c, ")");
    }
}
