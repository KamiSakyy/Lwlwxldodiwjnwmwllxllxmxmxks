package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wr {
    public final xr a;

    public wr(xr xrVar) {
        this.a = xrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr) && k71.k.b(this.a, ((wr) obj).a);
    }

    public final int hashCode() {
        xr xrVar = this.a;
        if (xrVar == null) {
            return 0;
        }
        return xrVar.hashCode();
    }

    public final String toString() {
        return "RemoveStar(starrable=" + this.a + ")";
    }
}
