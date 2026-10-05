package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lq {
    public final mq a;
    public final List b;

    public lq(mq mqVar, List list) {
        this.a = mqVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        return k71.k.b(this.a, lqVar.a) && k71.k.b(this.b, lqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Organizations(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
