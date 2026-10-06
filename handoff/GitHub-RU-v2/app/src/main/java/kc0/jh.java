package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jh implements aaShadow.m0 {
    public final lh a;

    public jh(lh lhVar) {
        this.a = lhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh) && k71.k.b(this.a, ((jh) obj).a);
    }

    public final int hashCode() {
        lh lhVar = this.a;
        if (lhVar == null) {
            return 0;
        }
        return lhVar.hashCode();
    }

    public final String toString() {
        return "Data(markDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
