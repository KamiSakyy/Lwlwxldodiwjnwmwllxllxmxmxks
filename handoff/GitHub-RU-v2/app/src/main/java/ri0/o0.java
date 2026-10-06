package ri0;

import gn0.na;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public na a;
    public String b;

    public o0(na naVar, String str) {
        this.a = naVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a == o0Var.a && k71.k.b(this.b, o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(viewerViewedState=" + this.a + ", path=" + this.b + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
