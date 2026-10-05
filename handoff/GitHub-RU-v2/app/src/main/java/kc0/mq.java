package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mq {
    public final jq a;
    public final List b;

    public mq(jq jqVar, List list) {
        this.a = jqVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq)) {
            return false;
        }
        mq mqVar = (mq) obj;
        return k71.k.b(this.a, mqVar.a) && k71.k.b(this.b, mqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ReleaseAssets(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
