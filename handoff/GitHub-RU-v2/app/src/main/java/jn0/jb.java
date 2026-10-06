package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jb {
    public hb a;

    public jb(hb hbVar) {
        this.a = hbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb) && k71.k.b(this.a, ((jb) obj).a);
    }

    public final int hashCode() {
        hb hbVar = this.a;
        if (hbVar == null) {
            return 0;
        }
        return hbVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussionComment(discussion=" + this.a + ")";
    }
}
