package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qt {
    public st a;
    public List b;

    public qt(st stVar, List list) {
        this.a = stVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return k71.k.b(this.a, qtVar.a) && k71.k.b(this.b, qtVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Mentions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
