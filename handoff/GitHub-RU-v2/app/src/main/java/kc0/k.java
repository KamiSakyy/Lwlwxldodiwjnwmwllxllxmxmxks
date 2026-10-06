package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aaShadow.m0 {
    public final g a;

    public k(g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        g gVar = this.a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public final String toString() {
        return "Data(addDiscussionComment=" + this.a + ")";
    }
}
