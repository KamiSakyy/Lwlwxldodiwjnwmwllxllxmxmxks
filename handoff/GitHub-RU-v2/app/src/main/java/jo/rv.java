package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rv implements aa.m0 {
    public final sv a;

    public rv(sv svVar) {
        this.a = svVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv) && k71.k.b(this.a, ((rv) obj).a);
    }

    public final int hashCode() {
        sv svVar = this.a;
        if (svVar == null) {
            return 0;
        }
        return svVar.hashCode();
    }

    public final String toString() {
        return "Data(removeDashboardSearchShortcut=" + this.a + ")";
    }
}
