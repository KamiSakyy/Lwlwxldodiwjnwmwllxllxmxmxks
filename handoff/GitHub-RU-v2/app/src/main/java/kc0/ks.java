package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ks {
    public ps a;
    public List b;

    public ks(ps psVar, List list) {
        this.a = psVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks)) {
            return false;
        }
        ks ksVar = (ks) obj;
        return k71.k.b(this.a, ksVar.a) && k71.k.b(this.b, ksVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Contributors(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
