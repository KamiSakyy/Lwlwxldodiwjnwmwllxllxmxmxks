package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hh0 {
    public final m10.u6 a;

    public hh0(m10.u6 u6Var) {
        this.a = u6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh0) && this.a == ((hh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContributionDay(contributionLevel=" + this.a + ")";
    }
}
