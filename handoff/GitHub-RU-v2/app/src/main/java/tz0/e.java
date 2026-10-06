package tz0;

import java.util.ArrayList;
import java.util.List;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final Object a;
    public final ArrayList b;
    public final i c;

    public e(List list, ArrayList arrayList, i iVar) {
        this.a = list;
        this.b = arrayList;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StatusChecksAndRollupsWithPage(statusChecks=" + this.a + ", stateRollups=" + this.b + ", page=" + this.c + ")";
    }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
