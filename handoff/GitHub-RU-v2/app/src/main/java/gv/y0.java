package gv;

import m10.qf;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public qf a;
    public String b;

    public y0(qf qfVar, String str) {
        this.a = qfVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a == y0Var.a && k71.k.b(this.b, y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(viewerViewedState=" + this.a + ", path=" + this.b + ")";
    }
}
