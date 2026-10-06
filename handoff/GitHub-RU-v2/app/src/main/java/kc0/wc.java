package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wc {
    public List a;
    public vc b;

    public wc(List list, vc vcVar) {
        this.a = list;
        this.b = vcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return k71.k.b(this.a, wcVar.a) && k71.k.b(this.b, wcVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Repositories(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
