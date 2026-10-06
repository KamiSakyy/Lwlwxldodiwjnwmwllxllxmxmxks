package il0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public final boolean a;
    public final String b;

    public s(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && k71.k.b(this.b, sVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
}
