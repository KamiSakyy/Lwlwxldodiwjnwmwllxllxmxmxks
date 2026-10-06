package v70;

import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public boolean a;
    public String b;

    public b(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
