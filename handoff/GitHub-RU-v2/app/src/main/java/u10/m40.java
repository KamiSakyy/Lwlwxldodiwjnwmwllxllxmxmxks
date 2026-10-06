package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m40 {
    public String a;
    public String b;
    public String c;

    public m40(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return k71.k.b(this.a, m40Var.a) && k71.k.b(this.b, m40Var.b) && k71.k.b(this.c, m40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Column(name=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
