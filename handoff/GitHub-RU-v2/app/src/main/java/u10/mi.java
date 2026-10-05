package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mi implements aa.m0 {
    public final ni a;

    public mi(ni niVar) {
        this.a = niVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi) && k71.k.b(this.a, ((mi) obj).a);
    }

    public final int hashCode() {
        ni niVar = this.a;
        if (niVar == null) {
            return 0;
        }
        return niVar.hashCode();
    }

    public final String toString() {
        return "Data(markPullRequestReadyForReview=" + this.a + ")";
    }
}
