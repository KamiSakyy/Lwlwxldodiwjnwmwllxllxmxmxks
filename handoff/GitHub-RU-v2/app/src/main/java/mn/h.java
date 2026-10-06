package mn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public x01.i a;
    public Object b;

    public h(List list, x01.i iVar) {
        this.a = iVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && this.b.equals(hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionCheckSuitesPaged(page=" + this.a + ", checkSuites=" + this.b + ")";
    }
}
