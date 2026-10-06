package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public j a;

    public g(j jVar) {
        this.a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        j jVar = this.a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public final String toString() {
        return "CommentEdge(node=" + this.a + ")";
    }
}
