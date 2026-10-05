package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ai implements aa.m0 {
    public final bi a;

    public ai(bi biVar) {
        this.a = biVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && k71.k.b(this.a, ((ai) obj).a);
    }

    public final int hashCode() {
        bi biVar = this.a;
        if (biVar == null) {
            return 0;
        }
        return biVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsRead=" + this.a + ")";
    }
}
