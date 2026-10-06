package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sx {
    public final ux a;
    public final List b;

    public sx(ux uxVar, List list) {
        this.a = uxVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        return k71.k.b(this.a, sxVar.a) && k71.k.b(this.b, sxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Milestones(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
