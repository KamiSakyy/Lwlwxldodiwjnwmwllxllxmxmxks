package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a30 {
    public final boolean a;
    public final String b;

    public a30(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a30)) {
            return false;
        }
        a30 a30Var = (a30) obj;
        return this.a == a30Var.a && k71.k.b(this.b, a30Var.b);
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
