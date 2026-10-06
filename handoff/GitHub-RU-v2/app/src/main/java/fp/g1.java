package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1Shadow {
    public boolean a;
    public boolean b;
    public String c;

    public g1(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1Shadow)) {
            return false;
        }
        g1Shadow g1Var = (g1Shadow) obj;
        return this.a == g1Var.a && this.b == g1Var.b && k71.k.b(this.c, g1Var.c);
    }

    public final int hashCode() {
        int e = x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.u("PageInfo(hasNextPage=", this.a, ", hasPreviousPage=", this.b, ", endCursor="), this.c, ")");
    }
}
