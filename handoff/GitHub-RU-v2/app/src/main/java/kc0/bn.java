package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bn {
    public cn a;
    public List b;

    public bn(cn cnVar, List list) {
        this.a = cnVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return k71.k.b(this.a, bnVar.a) && k71.k.b(this.b, bnVar.b);
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
