package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ps {
    public boolean a;
    public String b;

    public ps(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        return this.a == psVar.a && k71.k.b(this.b, psVar.b);
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
