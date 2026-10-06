package kj;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public oa.j a;
    public int b;

    public r0(oa.j jVar, int i) {
        k71.k.g(jVar, "user");
        this.a = jVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && this.b == r0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UserUnreadNotificationsInfo(user=" + this.a + ", unreadNotifications=" + this.b + ")";
    }
}
