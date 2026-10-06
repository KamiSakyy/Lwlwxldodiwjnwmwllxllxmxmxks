package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public g a;

    public f(g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        g gVar = this.a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public final String toString() {
        return "AddComment(commentEdge=" + this.a + ")";
    }
}
