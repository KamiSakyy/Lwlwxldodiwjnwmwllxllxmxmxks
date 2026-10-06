package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gm implements aaShadow.m0 {
    public hm a;

    public gm(hm hmVar) {
        this.a = hmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm) && k71.k.b(this.a, ((gm) obj).a);
    }

    public final int hashCode() {
        hm hmVar = this.a;
        if (hmVar == null) {
            return 0;
        }
        return hmVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsUnread=" + this.a + ")";
    }
}
