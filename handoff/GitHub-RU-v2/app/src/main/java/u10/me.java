package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class me {
    public final ne a;

    public me(ne neVar) {
        this.a = neVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me) && k71.k.b(this.a, ((me) obj).a);
    }

    public final int hashCode() {
        ne neVar = this.a;
        if (neVar == null) {
            return 0;
        }
        return neVar.hashCode();
    }

    public final String toString() {
        return "FollowUser(user=" + this.a + ")";
    }
}
