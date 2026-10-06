package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d6 {
    public boolean a;
    public String b;

    public d6(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return this.a == d6Var.a && k71.k.b(this.b, d6Var.b);
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
