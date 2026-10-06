package eq;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("OnUser(id=", this.a, ", name=", this.b, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
