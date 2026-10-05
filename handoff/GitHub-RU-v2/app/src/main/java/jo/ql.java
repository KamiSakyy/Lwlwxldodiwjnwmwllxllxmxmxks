package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ql implements aa.m0 {
    public final rl a;

    public ql(rl rlVar) {
        this.a = rlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql) && k71.k.b(this.a, ((ql) obj).a);
    }

    public final int hashCode() {
        rl rlVar = this.a;
        if (rlVar == null) {
            return 0;
        }
        return rlVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationSubjectAsRead=" + this.a + ")";
    }
}
