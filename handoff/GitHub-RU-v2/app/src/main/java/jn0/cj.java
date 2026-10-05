package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cj {
    public final bj a;

    public cj(bj bjVar) {
        this.a = bjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj) && k71.k.b(this.a, ((cj) obj).a);
    }

    public final int hashCode() {
        bj bjVar = this.a;
        if (bjVar == null) {
            return 0;
        }
        return bjVar.hashCode();
    }

    public final String toString() {
        return "MarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
