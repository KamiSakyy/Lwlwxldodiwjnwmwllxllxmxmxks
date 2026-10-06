package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 {
    public String a;
    public String b;
    public String c;

    public i2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b) && k71.k.b(this.c, i2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Topic(id=", this.a, ", name=", this.b, ", __typename="), this.c, ")");
    }
}
