package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.m0 {
    public final n a;

    public p(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && k71.k.b(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        n nVar = this.a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "Data(addDiscussionPollVote=" + this.a + ")";
    }
}
