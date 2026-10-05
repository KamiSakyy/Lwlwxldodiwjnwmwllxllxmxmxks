package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rj implements aa.m0 {
    public final sj a;

    public rj(sj sjVar) {
        this.a = sjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj) && k71.k.b(this.a, ((rj) obj).a);
    }

    public final int hashCode() {
        sj sjVar = this.a;
        if (sjVar == null) {
            return 0;
        }
        return sjVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsRead=" + this.a + ")";
    }
}
