package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dl {
    public String a;
    public e50.p b;

    public dl(String str, e50.p pVar) {
        this.a = str;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return k71.k.b(this.a, dlVar.a) && k71.k.b(this.b, dlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionCommentsFragment=" + this.b + ")";
    }
    public dl(String p1, Object p2) {
    }
}
