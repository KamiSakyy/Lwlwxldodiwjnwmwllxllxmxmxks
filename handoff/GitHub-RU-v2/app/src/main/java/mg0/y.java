package mg0;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public String a;
    public int b;
    public x c;
    public List d;

    public y(String str, int i, x xVar, List list) {
        this.a = str;
        this.b = i;
        this.c = xVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && this.b == yVar.b && k71.k.b(this.c, yVar.c) && k71.k.b(this.d, yVar.d);
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
}
