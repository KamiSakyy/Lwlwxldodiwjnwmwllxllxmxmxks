package mn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow {
    public ArrayList a;
    public x01.i b;

    public Object x(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return this.a.equals(xVar.a) && this.b.equals(xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkflowsPaged(workflows=" + this.a + ", page=" + this.b + ")";
    }
}
