package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j90 {
    public boolean a;
    public boolean b;
    public String c;

    public j90(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj;
        return this.a == j90Var.a && this.b == j90Var.b && k71.k.b(this.c, j90Var.c);
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
