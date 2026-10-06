package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hx {
    public List a;
    public String b;

    public hx(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx)) {
            return false;
        }
        hx hxVar = (hx) obj;
        return k71.k.b(this.a, hxVar.a) && k71.k.b(this.b, hxVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "OnTree(entries=" + this.a + ", id=" + this.b + ")";
    }
}
