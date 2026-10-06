package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g00 {
    public boolean a;
    public String b;

    public g00(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return this.a == g00Var.a && k71.k.b(this.b, g00Var.b);
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
