package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ng {
    public final tg a;
    public final List b;

    public ng(tg tgVar, List list) {
        this.a = tgVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng)) {
            return false;
        }
        ng ngVar = (ng) obj;
        return k71.k.b(this.a, ngVar.a) && k71.k.b(this.b, ngVar.b);
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
