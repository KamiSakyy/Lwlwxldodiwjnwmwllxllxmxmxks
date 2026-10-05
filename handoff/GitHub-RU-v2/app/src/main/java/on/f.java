package on;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final Object a;
    public final x01.i b;

    public f(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CodingAgentsPaged(codingAgents=" + this.a + ", page=" + this.b + ")";
    }
}
