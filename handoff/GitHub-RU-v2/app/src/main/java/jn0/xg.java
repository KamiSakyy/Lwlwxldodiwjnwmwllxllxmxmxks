package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xg {
    public final yg a;

    public xg(yg ygVar) {
        this.a = ygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg) && k71.k.b(this.a, ((xg) obj).a);
    }

    public final int hashCode() {
        yg ygVar = this.a;
        if (ygVar == null) {
            return 0;
        }
        return ygVar.hashCode();
    }

    public final String toString() {
        return "FollowUser(user=" + this.a + ")";
    }
}
