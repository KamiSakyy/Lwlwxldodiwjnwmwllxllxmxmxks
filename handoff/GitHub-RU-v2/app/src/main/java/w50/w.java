package w50;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public final String a;
    public final int b;
    public final v c;
    public final List d;

    public w(String str, int i, v vVar, List list) {
        this.a = str;
        this.b = i;
        this.c = vVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && this.b == wVar.b && k71.k.b(this.c, wVar.c) && k71.k.b(this.d, wVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        List list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "TimelineItems(__typename=", this.a, ", beforeFocusCount=", ", pageInfo=");
        n.append(this.c);
        n.append(", nodes=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
    public Object e(Object p1) { return null; }
}
