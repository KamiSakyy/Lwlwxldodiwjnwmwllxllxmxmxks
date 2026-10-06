package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o50 {
    public final boolean a;
    public final String b;

    public o50(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o50)) {
            return false;
        }
        o50 o50Var = (o50) obj;
        return this.a == o50Var.a && k71.k.b(this.b, o50Var.b);
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
