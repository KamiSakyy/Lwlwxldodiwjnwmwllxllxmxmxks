package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j3 {
    public String a;
    public int b;
    public String c;

    public j3(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return k71.k.b(this.a, j3Var.a) && this.b == j3Var.b && k71.k.b(this.c, j3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "Repository(id=", this.a, ", planLimit=", ", __typename="), this.c, ")");
    }
}
