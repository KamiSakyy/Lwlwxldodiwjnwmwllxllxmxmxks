package x91;

import b21.v;
import java.util.Collection;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d {
    public final v a;
    public final List b;
    public final Collection c;

    public d(v vVar, List list, Collection collection) {
        k.g(vVar, "iteratorPosition");
        k.g(collection, "rangesToProcessFurther");
        this.a = vVar;
        this.b = list;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1.e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.a + ", parsedNodes=" + this.b + ", rangesToProcessFurther=" + this.c + ')';
    }
}
