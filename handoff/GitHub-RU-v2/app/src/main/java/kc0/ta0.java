package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ta0 {
    public final gn0.z4 a;

    public ta0(gn0.z4 z4Var) {
        this.a = z4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta0) && this.a == ((ta0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContributionDay(contributionLevel=" + this.a + ")";
    }
}
