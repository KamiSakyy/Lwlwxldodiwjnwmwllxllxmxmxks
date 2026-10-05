package ey;

import java.util.ArrayList;
import m10.ba0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final ba0 a;
    public final ArrayList b;

    public h(ba0 ba0Var, ArrayList arrayList) {
        this.a = ba0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b.equals(hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatusRollup(combinedState=" + this.a + ", summary=" + this.b + ")";
    }
}
