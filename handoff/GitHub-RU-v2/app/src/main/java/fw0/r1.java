package fw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 {
    public final String a;
    public final String b;
    public final String c;

    public r1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return k71.k.b(this.a, r1Var.a) && k71.k.b(this.b, r1Var.b) && k71.k.b(this.c, r1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Tier(id=", this.a, ", badgeImageUrl=", this.b, ", __typename="), this.c, ")");
    }
}
