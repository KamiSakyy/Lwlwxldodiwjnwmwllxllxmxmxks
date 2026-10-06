package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zz {
    public boolean a;
    public String b;

    public zz(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return this.a == zzVar.a && k71.k.b(this.b, zzVar.b);
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
