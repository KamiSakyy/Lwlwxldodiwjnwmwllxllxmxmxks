package m00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final t a;
    public final List b;

    public r(t tVar, List list) {
        this.a = tVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "IssueTypes(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
