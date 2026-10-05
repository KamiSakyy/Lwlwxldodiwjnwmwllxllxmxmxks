package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gq {
    public final fq a;
    public final List b;

    public gq(fq fqVar, List list) {
        this.a = fqVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq)) {
            return false;
        }
        gq gqVar = (gq) obj;
        return k71.k.b(this.a, gqVar.a) && k71.k.b(this.b, gqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Teams(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i<T1,T2,T3,T4> {
        public i() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
