package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ih0 {
    public gh0 a;

    public ih0(gh0 gh0Var) {
        this.a = gh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih0) && k71.k.b(this.a, ((ih0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ContributionsCollection(contributionCalendar=" + this.a + ")";
    }
}
