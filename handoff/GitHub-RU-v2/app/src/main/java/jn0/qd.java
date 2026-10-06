package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qd {
    public List a;
    public pd b;

    public qd(List list, pd pdVar) {
        this.a = list;
        this.b = pdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return k71.k.b(this.a, qdVar.a) && k71.k.b(this.b, qdVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Repositories(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
