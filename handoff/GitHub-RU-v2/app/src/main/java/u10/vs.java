package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vs {
    public final us a;
    public final List b;

    public vs(us usVar, List list) {
        this.a = usVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs)) {
            return false;
        }
        vs vsVar = (vs) obj;
        return k71.k.b(this.a, vsVar.a) && k71.k.b(this.b, vsVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Watchers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
