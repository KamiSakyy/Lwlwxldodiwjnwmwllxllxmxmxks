package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fr {
    public final cr a;

    public fr(cr crVar) {
        this.a = crVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr) && k71.k.b(this.a, ((fr) obj).a);
    }

    public final int hashCode() {
        cr crVar = this.a;
        if (crVar == null) {
            return 0;
        }
        return crVar.hashCode();
    }

    public final String toString() {
        return "ProvideCopilotCodeReviewFeedback(comment=" + this.a + ")";
    }
}
