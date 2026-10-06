package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rs {
    public int a;
    public List b;

    public rs(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs)) {
            return false;
        }
        rs rsVar = (rs) obj;
        return this.a == rsVar.a && k71.k.b(this.b, rsVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Requested(issueCount=", ", nodes=", ")", this.b);
    }
}
