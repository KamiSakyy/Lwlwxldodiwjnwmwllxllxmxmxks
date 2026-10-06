package lt;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final List b;

    public b(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.o("Labels2(__typename=", this.a, ", nodes=", ")", this.b);
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
