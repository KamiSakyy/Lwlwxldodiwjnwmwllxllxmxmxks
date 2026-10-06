package s91;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f {
    public t91.d a;
    public t91.d b;
    public List c;

    public f(t91.d dVar, t91.d dVar2, List list) {
        k.g(dVar, "currentConstraints");
        k.g(dVar2, "nextConstraints");
        k.g(list, "markersStack");
        this.a = dVar;
        this.b = dVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 37)) * 37);
    }
}
