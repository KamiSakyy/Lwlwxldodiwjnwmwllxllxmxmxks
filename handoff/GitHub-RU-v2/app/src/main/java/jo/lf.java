package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lf {
    public final List a;
    public final nf b;

    public lf(List list, nf nfVar) {
        this.a = list;
        this.b = nfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return k71.k.b(this.a, lfVar.a) && k71.k.b(this.b, lfVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Feed(filters=" + this.a + ", items=" + this.b + ")";
    }
}
