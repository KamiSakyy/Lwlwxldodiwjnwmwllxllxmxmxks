package mn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public ArrayList a;
    public x01.i b;

    public x(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a.equals(xVar.a) && this.b.equals(xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkflowsPaged(workflows=" + this.a + ", page=" + this.b + ")";
    }
}
