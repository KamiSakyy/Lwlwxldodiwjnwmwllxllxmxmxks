package on;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public Object a;
    public x01.i b;

    public d(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AgentTasksPaged(sessions=" + this.a + ", page=" + this.b + ")";
    }
}
