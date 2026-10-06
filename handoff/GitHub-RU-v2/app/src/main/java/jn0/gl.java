package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gl {
    public final hl a;

    public gl(hl hlVar) {
        this.a = hlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl) && k71.k.b(this.a, ((gl) obj).a);
    }

    public final int hashCode() {
        hl hlVar = this.a;
        if (hlVar == null) {
            return 0;
        }
        return hlVar.hashCode();
    }

    public final String toString() {
        return "MarkPullRequestReadyForReview(pullRequest=" + this.a + ")";
    }
}
