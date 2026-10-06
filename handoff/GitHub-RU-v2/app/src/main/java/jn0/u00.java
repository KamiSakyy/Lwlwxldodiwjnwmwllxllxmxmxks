package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u00 {
    public final String a;
    public final String b;
    public final String c;

    public u00(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u00)) {
            return false;
        }
        u00 u00Var = (u00) obj;
        return k71.k.b(this.a, u00Var.a) && k71.k.b(this.b, u00Var.b) && k71.k.b(this.c, u00Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Repository(licenseContents=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
