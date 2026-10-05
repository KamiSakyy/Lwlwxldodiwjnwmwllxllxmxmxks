package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xt implements aa.v0 {
    public final zt a;

    public xt(zt ztVar) {
        this.a = ztVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt) && k71.k.b(this.a, ((xt) obj).a);
    }

    public final int hashCode() {
        zt ztVar = this.a;
        if (ztVar == null) {
            return 0;
        }
        return ztVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
