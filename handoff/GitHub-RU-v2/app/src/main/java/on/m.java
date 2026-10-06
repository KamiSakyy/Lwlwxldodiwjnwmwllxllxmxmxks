package on;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public final Object a;
    public final x01.i b;

    public m(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.b.equals(mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubagentsPaged(subagents=" + this.a + ", page=" + this.b + ")";
    }
}
