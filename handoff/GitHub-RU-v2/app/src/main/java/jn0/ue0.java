package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ue0 {
    public se0 a;

    public ue0(se0 se0Var) {
        this.a = se0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue0) && k71.k.b(this.a, ((ue0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ContributionsCollection(contributionCalendar=" + this.a + ")";
    }
}
