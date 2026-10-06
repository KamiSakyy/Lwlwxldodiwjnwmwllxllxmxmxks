package ar0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public q a;
    public List b;

    public o(q qVar, List list) {
        this.a = qVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b);
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
