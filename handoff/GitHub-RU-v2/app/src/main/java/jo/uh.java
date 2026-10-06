package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uh {
    public vh a;

    public uh(vh vhVar) {
        this.a = vhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh) && k71.k.b(this.a, ((uh) obj).a);
    }

    public final int hashCode() {
        vh vhVar = this.a;
        if (vhVar == null) {
            return 0;
        }
        return vhVar.hashCode();
    }

    public final String toString() {
        return "FollowUser(user=" + this.a + ")";
    }
}
