package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fe {
    public ie a;
    public List b;

    public fe(ie ieVar, List list) {
        this.a = ieVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return k71.k.b(this.a, feVar.a) && k71.k.b(this.b, feVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "History(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
