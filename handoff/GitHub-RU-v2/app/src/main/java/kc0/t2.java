package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t2 {
    public v2 a;

    public t2(v2 v2Var) {
        this.a = v2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2) && k71.k.b(this.a, ((t2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepositoryNode(repository=" + this.a + ")";
    }
}
