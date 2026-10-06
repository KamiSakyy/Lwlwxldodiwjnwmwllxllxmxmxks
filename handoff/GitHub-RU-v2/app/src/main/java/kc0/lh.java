package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lh {
    public kh a;

    public lh(kh khVar) {
        this.a = khVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh) && k71.k.b(this.a, ((lh) obj).a);
    }

    public final int hashCode() {
        kh khVar = this.a;
        if (khVar == null) {
            return 0;
        }
        return khVar.hashCode();
    }

    public final String toString() {
        return "MarkDiscussionCommentAsAnswer(discussion=" + this.a + ")";
    }
}
