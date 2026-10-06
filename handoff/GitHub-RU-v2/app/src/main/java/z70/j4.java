package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j4 {
    public final String a;
    public final String b;
    public final String c;

    public j4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return k71.k.b(this.a, j4Var.a) && k71.k.b(this.b, j4Var.b) && k71.k.b(this.c, j4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("HeadRepository(id=", this.a, ", nameWithOwner=", this.b, ", __typename="), this.c, ")");
    }
}
