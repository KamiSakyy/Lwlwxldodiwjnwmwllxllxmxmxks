package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public final String a;
    public final boolean b;

    public c1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && this.b == c1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.n("PageInfo(endCursor=", this.a, ", hasNextPage=", ")", this.b);
    }
}
