package wp0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final l a;

    public g(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepositoryNode(repository=" + this.a + ")";
    }
}
