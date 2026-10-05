package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nb implements aa.m0 {
    public final ob a;

    public nb(ob obVar) {
        this.a = obVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb) && k71.k.b(this.a, ((nb) obj).a);
    }

    public final int hashCode() {
        ob obVar = this.a;
        if (obVar == null) {
            return 0;
        }
        return obVar.hashCode();
    }

    public final String toString() {
        return "Data(dismissPullRequestReview=" + this.a + ")";
    }
}
