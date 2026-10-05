package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t80 {
    public final hc0.p4 a;

    public t80(hc0.p4 p4Var) {
        this.a = p4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t80) && this.a == ((t80) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContributionDay(contributionLevel=" + this.a + ")";
    }
}
