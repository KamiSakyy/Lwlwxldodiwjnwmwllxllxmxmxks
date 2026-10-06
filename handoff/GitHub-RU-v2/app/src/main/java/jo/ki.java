package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ki {
    public int a;
    public List b;

    public ki(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        return this.a == kiVar.a && k71.k.b(this.b, kiVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Issues(issueCount=", ", nodes=", ")", this.b);
    }
}
