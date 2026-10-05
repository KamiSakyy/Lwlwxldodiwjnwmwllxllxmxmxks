package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aj implements aa.m0 {
    public final cj a;

    public aj(cj cjVar) {
        this.a = cjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && k71.k.b(this.a, ((aj) obj).a);
    }

    public final int hashCode() {
        cj cjVar = this.a;
        if (cjVar == null) {
            return 0;
        }
        return cjVar.hashCode();
    }

    public final String toString() {
        return "Data(markDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
