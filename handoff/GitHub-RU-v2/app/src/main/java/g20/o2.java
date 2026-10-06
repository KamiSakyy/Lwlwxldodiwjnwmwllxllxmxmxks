package g20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 {
    public String a;
    public String b;
    public String c;

    public o2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.a, o2Var.a) && k71.k.b(this.b, o2Var.b) && k71.k.b(this.c, o2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Creator(id=", this.a, ", login=", this.b, ", __typename="), this.c, ")");
    }
}
