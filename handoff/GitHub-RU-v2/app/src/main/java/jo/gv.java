package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gv implements aa.m0 {
    public final hv a;

    public gv(hv hvVar) {
        this.a = hvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv) && k71.k.b(this.a, ((gv) obj).a);
    }

    public final int hashCode() {
        hv hvVar = this.a;
        if (hvVar == null) {
            return 0;
        }
        return hvVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteUserDashboardPin=" + this.a + ")";
    }




















}
