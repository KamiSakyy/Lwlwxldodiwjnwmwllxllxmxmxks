package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hm {
    public final String a;
    public final uf0.r b;

    public hm(String str, uf0.r rVar) {
        this.a = str;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        return k71.k.b(this.a, hmVar.a) && k71.k.b(this.b, hmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionCommentsFragment=" + this.b + ")";
    }
}
