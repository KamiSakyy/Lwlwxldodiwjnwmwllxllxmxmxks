package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ut implements aa.m0 {
    public final vt a;

    public ut(vt vtVar) {
        this.a = vtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut) && k71.k.b(this.a, ((ut) obj).a);
    }

    public final int hashCode() {
        vt vtVar = this.a;
        if (vtVar == null) {
            return 0;
        }
        return vtVar.hashCode();
    }

    public final String toString() {
        return "Data(removeDashboardSearchShortcut=" + this.a + ")";
    }
}
