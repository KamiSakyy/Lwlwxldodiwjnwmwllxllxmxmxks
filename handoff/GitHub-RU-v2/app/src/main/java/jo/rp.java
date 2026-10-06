package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rp {
    public String a;
    public is.r b;

    public rp(String str, is.r rVar) {
        this.a = str;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp)) {
            return false;
        }
        rp rpVar = (rp) obj;
        return k71.k.b(this.a, rpVar.a) && k71.k.b(this.b, rpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionCommentsFragment=" + this.b + ")";
    }
}
