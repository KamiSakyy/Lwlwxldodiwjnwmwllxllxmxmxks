package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ni {
    public oi a;

    public ni(oi oiVar) {
        this.a = oiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni) && k71.k.b(this.a, ((ni) obj).a);
    }

    public final int hashCode() {
        oi oiVar = this.a;
        if (oiVar == null) {
            return 0;
        }
        return oiVar.hashCode();
    }

    public final String toString() {
        return "MarkPullRequestReadyForReview(pullRequest=" + this.a + ")";
    }
}
