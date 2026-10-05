package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class er implements aa.m0 {
    public final fr a;

    public er(fr frVar) {
        this.a = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er) && k71.k.b(this.a, ((er) obj).a);
    }

    public final int hashCode() {
        fr frVar = this.a;
        if (frVar == null) {
            return 0;
        }
        return frVar.hashCode();
    }

    public final String toString() {
        return "Data(provideCopilotCodeReviewFeedback=" + this.a + ")";
    }
}
