package ml0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public f a;

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
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object i = null;
}
