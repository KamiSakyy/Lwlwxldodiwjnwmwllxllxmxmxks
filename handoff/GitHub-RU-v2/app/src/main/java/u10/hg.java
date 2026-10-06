package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hg implements aaShadow.m0 {
    public jg a;

    public hg(jg jgVar) {
        this.a = jgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg) && k71.k.b(this.a, ((hg) obj).a);
    }

    public final int hashCode() {
        jg jgVar = this.a;
        if (jgVar == null) {
            return 0;
        }
        return jgVar.hashCode();
    }

    public final String toString() {
        return "Data(markDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
