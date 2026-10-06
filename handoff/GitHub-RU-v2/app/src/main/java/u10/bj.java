package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bj {
    public si a;

    public bj(si siVar) {
        this.a = siVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj) && k71.k.b(this.a, ((bj) obj).a);
    }

    public final int hashCode() {
        si siVar = this.a;
        if (siVar == null) {
            return 0;
        }
        return siVar.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(mentionableItems=" + this.a + ")";
    }
}
