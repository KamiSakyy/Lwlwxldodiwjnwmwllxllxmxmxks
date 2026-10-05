package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ve {
    public final bf a;
    public final List b;

    public ve(bf bfVar, List list) {
        this.a = bfVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return k71.k.b(this.a, veVar.a) && k71.k.b(this.b, veVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Following(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
