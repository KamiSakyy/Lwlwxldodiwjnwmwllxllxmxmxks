package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r20 {
    public boolean a;
    public String b;

    public r20(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r20)) {
            return false;
        }
        r20 r20Var = (r20) obj;
        return this.a == r20Var.a && k71.k.b(this.b, r20Var.b);
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
