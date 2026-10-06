package o01;

import java.util.List;
import k71.k;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public a a;
    public List b;
    public i c;

    public f(a aVar, List list, i iVar) {
        this.a = aVar;
        this.b = list;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        a aVar = this.a;
        return this.c.hashCode() + f1.e.c(this.b, (aVar == null ? 0 : aVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "ReleasesList(latestRelease=" + this.a + ", releases=" + this.b + ", page=" + this.c + ")";
    }
}
