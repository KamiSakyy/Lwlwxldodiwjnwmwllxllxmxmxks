package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vc0 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public vc0(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj;
        return this.a == vc0Var.a && this.b == vc0Var.b && k71.k.b(this.c, vc0Var.c);
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
