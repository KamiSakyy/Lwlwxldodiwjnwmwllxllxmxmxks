package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wy implements aa.m0 {
    public final xy a;

    public wy(xy xyVar) {
        this.a = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy) && k71.k.b(this.a, ((wy) obj).a);
    }

    public final int hashCode() {
        xy xyVar = this.a;
        if (xyVar == null) {
            return 0;
        }
        return xyVar.hashCode();
    }

    public final String toString() {
        return "Data(setDashboardSearchShortcuts=" + this.a + ")";
    }
}
