package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aaShadow.m0 {
    public final l a;

    public p(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && k71.k.b(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(addDiscussionComment=" + this.a + ")";
    }
}
