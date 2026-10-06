package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cj implements aaShadow.m0 {
    public dj a;

    public cj(dj djVar) {
        this.a = djVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj) && k71.k.b(this.a, ((cj) obj).a);
    }

    public final int hashCode() {
        dj djVar = this.a;
        if (djVar == null) {
            return 0;
        }
        return djVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsRead=" + this.a + ")";
    }
}
