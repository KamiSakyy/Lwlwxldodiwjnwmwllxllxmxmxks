package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ff {
    public gf a;

    public ff(gf gfVar) {
        this.a = gfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff) && k71.k.b(this.a, ((ff) obj).a);
    }

    public final int hashCode() {
        gf gfVar = this.a;
        if (gfVar == null) {
            return 0;
        }
        return gfVar.hashCode();
    }

    public final String toString() {
        return "FollowUser(user=" + this.a + ")";
    }
}
