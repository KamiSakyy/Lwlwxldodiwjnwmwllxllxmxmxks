package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ha implements aaShadow.m0 {
    public ia a;

    public ha(ia iaVar) {
        this.a = iaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha) && k71.k.b(this.a, ((ha) obj).a);
    }

    public final int hashCode() {
        ia iaVar = this.a;
        if (iaVar == null) {
            return 0;
        }
        return iaVar.hashCode();
    }

    public final String toString() {
        return "Data(deletePullRequestReviewComment=" + this.a + ")";
    }
}
