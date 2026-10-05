package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public d2(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return k71.k.b(this.a, d2Var.a) && k71.k.b(this.b, d2Var.b) && k71.k.b(this.c, d2Var.c) && k71.k.b(this.d, d2Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("PrimaryLanguage(color=", this.a, ", name=", this.b, ", id="), this.c, ", __typename=", this.d, ")");
    }
}
