package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ky {
    public final qy a;
    public final List b;

    public ky(qy qyVar, List list) {
        this.a = qyVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        return k71.k.b(this.a, kyVar.a) && k71.k.b(this.b, kyVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Commits(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
