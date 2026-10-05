package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qv {
    public final uv a;
    public final List b;

    public qv(uv uvVar, List list) {
        this.a = uvVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return k71.k.b(this.a, qvVar.a) && k71.k.b(this.b, qvVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Forks(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
