package yw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final f a;

    public c(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        f fVar = this.a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "DequeuePullRequest(mergeQueueEntry=" + this.a + ")";
    }
}
