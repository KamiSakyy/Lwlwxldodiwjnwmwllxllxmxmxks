package np;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;

    public f(String str) {
        k71.k.g(str, "parentCommentId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("CommentReplyThreadParameters(parentCommentId=", this.a, ")");
    }
}
