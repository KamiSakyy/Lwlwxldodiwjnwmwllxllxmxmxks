package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public w a;

    public s(w wVar) {
        this.a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && k71.k.b(this.a, ((s) obj).a);
    }

    public final int hashCode() {
        w wVar = this.a;
        if (wVar == null) {
            return 0;
        }
        return wVar.hashCode();
    }

    public final String toString() {
        return "AddDiscussionPollVote(pollOption=" + this.a + ")";
    }
    public static final Object r = null;
}
