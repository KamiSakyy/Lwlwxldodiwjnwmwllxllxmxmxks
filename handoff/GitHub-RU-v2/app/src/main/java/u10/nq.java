package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nq implements aa.m0 {
    public final oq a;

    public nq(oq oqVar) {
        this.a = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq) && k71.k.b(this.a, ((nq) obj).a);
    }

    public final int hashCode() {
        oq oqVar = this.a;
        if (oqVar == null) {
            return 0;
        }
        return oqVar.hashCode();
    }

    public final String toString() {
        return "Data(removeDashboardSearchShortcut=" + this.a + ")";
    }
}
