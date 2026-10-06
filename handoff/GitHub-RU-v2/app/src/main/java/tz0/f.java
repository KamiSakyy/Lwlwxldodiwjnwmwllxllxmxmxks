package tz0;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public g a;
    public List b;

    public f(g gVar, List list) {
        this.a = gVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k.b(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StatusRollup(combinedState=" + this.a + ", stateRollups=" + this.b + ")";
    }
}
