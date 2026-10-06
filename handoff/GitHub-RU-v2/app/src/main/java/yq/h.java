package yq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final m a;

    public h(m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && k71.k.b(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepositoryNode(repository=" + this.a + ")";
    }
}
