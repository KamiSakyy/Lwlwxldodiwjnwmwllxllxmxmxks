package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rl {
    public boolean a;
    public String b;

    public rl(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj;
        return this.a == rlVar.a && k71.k.b(this.b, rlVar.b);
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
