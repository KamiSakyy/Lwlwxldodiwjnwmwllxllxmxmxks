package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class md {
    public pd a;
    public List b;

    public md(pd pdVar, List list) {
        this.a = pdVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        return k71.k.b(this.a, mdVar.a) && k71.k.b(this.b, mdVar.b);
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
