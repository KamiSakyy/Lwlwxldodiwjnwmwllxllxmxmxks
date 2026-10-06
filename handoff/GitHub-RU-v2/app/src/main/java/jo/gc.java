package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gc {
    public final ec a;

    public gc(ec ecVar) {
        this.a = ecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc) && k71.k.b(this.a, ((gc) obj).a);
    }

    public final int hashCode() {
        ec ecVar = this.a;
        if (ecVar == null) {
            return 0;
        }
        return ecVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussionComment(discussion=" + this.a + ")";
    }
}
