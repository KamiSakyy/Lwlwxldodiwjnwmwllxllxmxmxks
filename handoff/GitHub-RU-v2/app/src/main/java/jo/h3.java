package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h3 {
    public j3 a;

    public h3(j3 j3Var) {
        this.a = j3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3) && k71.k.b(this.a, ((h3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepositoryNode(repository=" + this.a + ")";
    }
}
