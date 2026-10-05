package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xk implements aa.m0 {
    public final yk a;

    public xk(yk ykVar) {
        this.a = ykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xk) && k71.k.b(this.a, ((xk) obj).a);
    }

    public final int hashCode() {
        yk ykVar = this.a;
        if (ykVar == null) {
            return 0;
        }
        return ykVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsUndone=" + this.a + ")";
    }
}
