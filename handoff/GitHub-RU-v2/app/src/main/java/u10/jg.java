package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jg {
    public ig a;

    public jg(ig igVar) {
        this.a = igVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg) && k71.k.b(this.a, ((jg) obj).a);
    }

    public final int hashCode() {
        ig igVar = this.a;
        if (igVar == null) {
            return 0;
        }
        return igVar.hashCode();
    }

    public final String toString() {
        return "MarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
