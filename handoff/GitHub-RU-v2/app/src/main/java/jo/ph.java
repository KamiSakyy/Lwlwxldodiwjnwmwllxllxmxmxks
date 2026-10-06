package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ph {
    public final boolean a;
    public final String b;

    public ph(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return this.a == phVar.a && k71.k.b(this.b, phVar.b);
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
