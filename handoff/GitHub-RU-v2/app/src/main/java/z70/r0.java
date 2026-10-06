package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public final String a;
    public final boolean b;

    public r0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && this.b == r0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.n("PageInfo(endCursor=", this.a, ", hasNextPage=", ")", this.b);
    }
}
