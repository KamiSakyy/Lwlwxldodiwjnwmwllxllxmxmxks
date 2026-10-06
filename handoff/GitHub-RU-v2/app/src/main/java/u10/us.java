package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class us {
    public boolean a;
    public String b;

    public us(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us)) {
            return false;
        }
        us usVar = (us) obj;
        return this.a == usVar.a && k71.k.b(this.b, usVar.b);
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
