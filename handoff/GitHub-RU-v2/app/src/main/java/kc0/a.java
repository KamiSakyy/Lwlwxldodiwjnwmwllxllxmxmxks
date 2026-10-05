package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "AddComment(commentEdge=" + this.a + ")";
    }
}
