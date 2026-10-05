package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kt {
    public final boolean a;
    public final String b;

    public kt(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt)) {
            return false;
        }
        kt ktVar = (kt) obj;
        return this.a == ktVar.a && k71.k.b(this.b, ktVar.b);
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
