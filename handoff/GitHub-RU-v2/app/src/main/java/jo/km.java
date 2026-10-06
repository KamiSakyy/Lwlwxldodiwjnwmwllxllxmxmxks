package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class km implements aaShadow.m0 {
    public final lm a;

    public km(lm lmVar) {
        this.a = lmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km) && k71.k.b(this.a, ((km) obj).a);
    }

    public final int hashCode() {
        lm lmVar = this.a;
        if (lmVar == null) {
            return 0;
        }
        return lmVar.hashCode();
    }

    public final String toString() {
        return "Data(markPullRequestReadyForReview=" + this.a + ")";
    }
}
