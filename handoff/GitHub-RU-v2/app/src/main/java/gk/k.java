package gk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public Long a;
    public Long b;

    public k(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoryVisitationResult(repositoryLastVisited=" + this.a + ", repoOwnerLastVisited=" + this.b + ")";
    }
}
