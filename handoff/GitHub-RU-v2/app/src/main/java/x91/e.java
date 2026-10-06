package x91;

import c21.h0;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e {
    public final q71.g a;
    public final h0 b;

    public e(q71.g gVar, h0 h0Var) {
        k.g(h0Var, "type");
        this.a = gVar;
        this.b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(range=" + this.a + ", type=" + this.b + ')';
    }
    public Object c(Object p1, Object p2, Object p3) { return null; }
}
