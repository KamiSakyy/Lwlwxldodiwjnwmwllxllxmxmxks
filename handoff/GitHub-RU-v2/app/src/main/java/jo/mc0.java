package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mc0 {
    public final String a;
    public final String b;
    public final String c;

    public mc0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0Var = (mc0) obj;
        return k71.k.b(this.a, mc0Var.a) && k71.k.b(this.b, mc0Var.b) && k71.k.b(this.c, mc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Discussion(id=", this.a, ", title=", this.b, ", __typename="), this.c, ")");
    }
}
