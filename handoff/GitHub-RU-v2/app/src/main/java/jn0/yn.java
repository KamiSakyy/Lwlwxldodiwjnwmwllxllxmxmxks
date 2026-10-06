package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yn {
    public final String a;
    public final ar0.r b;

    public yn(String str, ar0.r rVar) {
        this.a = str;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return k71.k.b(this.a, ynVar.a) && k71.k.b(this.b, ynVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionCommentsFragment=" + this.b + ")";
    }
}
