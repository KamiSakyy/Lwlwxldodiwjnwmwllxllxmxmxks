package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final m a;

    public l(m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        m mVar = this.a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "AddDiscussionComment(comment=" + this.a + ")";
    }
}
