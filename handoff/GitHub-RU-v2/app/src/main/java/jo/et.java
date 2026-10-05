package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class et {
    public final boolean a;
    public final String b;

    public et(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return this.a == etVar.a && k71.k.b(this.b, etVar.b);
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
