package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t6 {
    public boolean a;
    public String b;

    public t6(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return this.a == t6Var.a && k71.k.b(this.b, t6Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.m0.f("PageInfo1(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
}
