package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hk {
    public gk a;

    public hk(gk gkVar) {
        this.a = gkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk) && k71.k.b(this.a, ((hk) obj).a);
    }

    public final int hashCode() {
        gk gkVar = this.a;
        if (gkVar == null) {
            return 0;
        }
        return gkVar.hashCode();
    }

    public final String toString() {
        return "MarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
