package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y3 {
    public boolean a;
    public boolean b;
    public String c;

    public y3(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return this.a == y3Var.a && this.b == y3Var.b && k71.k.b(this.c, y3Var.c);
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
