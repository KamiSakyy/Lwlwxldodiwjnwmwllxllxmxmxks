package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cq implements aaShadow.m0 {
    public final dq a;

    public cq(dq dqVar) {
        this.a = dqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq) && k71.k.b(this.a, ((cq) obj).a);
    }

    public final int hashCode() {
        dq dqVar = this.a;
        if (dqVar == null) {
            return 0;
        }
        return dqVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteUserDashboardPin=" + this.a + ")";
    }
}
