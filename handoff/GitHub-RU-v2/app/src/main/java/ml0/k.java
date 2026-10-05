package ml0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final n a;

    public k(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        n nVar = this.a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "EnqueuePullRequest(mergeQueueEntry=" + this.a + ")";
    }
}
