package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class md implements aaShadow.m0 {
    public final nd a;

    public md(nd ndVar) {
        this.a = ndVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md) && k71.k.b(this.a, ((md) obj).a);
    }

    public final int hashCode() {
        nd ndVar = this.a;
        if (ndVar == null) {
            return 0;
        }
        return ndVar.hashCode();
    }

    public final String toString() {
        return "Data(dismissPullRequestReview=" + this.a + ")";
    }
}
