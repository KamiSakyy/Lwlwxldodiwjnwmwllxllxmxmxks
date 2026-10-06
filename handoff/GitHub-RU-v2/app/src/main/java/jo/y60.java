package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y60 {
    public boolean a;
    public String b;

    public y60(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj;
        return this.a == y60Var.a && k71.k.b(this.b, y60Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
}
