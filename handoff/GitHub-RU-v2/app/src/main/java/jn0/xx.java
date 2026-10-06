package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xx {
    public wx a;
    public List b;

    public xx(wx wxVar, List list) {
        this.a = wxVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx)) {
            return false;
        }
        xx xxVar = (xx) obj;
        return k71.k.b(this.a, xxVar.a) && k71.k.b(this.b, xxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Refs(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
