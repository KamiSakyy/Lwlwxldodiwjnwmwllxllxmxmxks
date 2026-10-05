package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sr {
    public final ur a;
    public final List b;

    public sr(ur urVar, List list) {
        this.a = urVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        return k71.k.b(this.a, srVar.a) && k71.k.b(this.b, srVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Mentions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
