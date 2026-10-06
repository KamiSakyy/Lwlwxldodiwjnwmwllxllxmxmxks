package e50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public o a;
    public List b;

    public m(o oVar, List list) {
        this.a = oVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Comments(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
