package q81;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f {
    public static final f c = new f(x61.m.K0(new ArrayList()), null);
    public Set a;
    public m7.y b;

    public f(Set set, m7.y yVar) {
        this.a = set;
        this.b = yVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(fVar.a, this.a) && k71.k.b(fVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        m7.y yVar = this.b;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }
    public Object E = null;
    public Object F = null;
}
