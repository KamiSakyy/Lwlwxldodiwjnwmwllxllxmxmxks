package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ev {
    public boolean a;
    public String b;

    public ev(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return this.a == evVar.a && k71.k.b(this.b, evVar.b);
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
