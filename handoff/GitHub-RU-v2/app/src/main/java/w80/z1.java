package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    public String a;
    public String b;
    public String c;
    public String d;

    public z1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return k71.k.b(this.a, z1Var.a) && k71.k.b(this.b, z1Var.b) && k71.k.b(this.c, z1Var.c) && k71.k.b(this.d, z1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("PrimaryLanguage(color=", this.a, ", name=", this.b, ", id="), this.c, ", __typename=", this.d, ")");
    }
}
