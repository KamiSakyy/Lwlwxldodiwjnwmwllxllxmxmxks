package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fx {
    public dx a;
    public List b;

    public fx(dx dxVar, List list) {
        this.a = dxVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return k71.k.b(this.a, fxVar.a) && k71.k.b(this.b, fxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
