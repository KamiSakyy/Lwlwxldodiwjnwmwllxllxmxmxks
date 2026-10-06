package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public r a;

    public n(r rVar) {
        this.a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && k71.k.b(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        r rVar = this.a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "AddDiscussionPollVote(pollOption=" + this.a + ")";
    }
}
