package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z2 {
    public b3 a;

    public z2(b3 b3Var) {
        this.a = b3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2) && k71.k.b(this.a, ((z2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepositoryNode(repository=" + this.a + ")";
    }
}
