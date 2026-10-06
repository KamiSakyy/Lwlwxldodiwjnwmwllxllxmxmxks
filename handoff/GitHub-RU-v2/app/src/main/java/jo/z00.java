package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z00 {
    public String a;
    public boolean b;

    public z00(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        return k71.k.b(this.a, z00Var.a) && this.b == z00Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.n("PageInfo(endCursor=", this.a, ", hasNextPage=", ")", this.b);
    }
}
