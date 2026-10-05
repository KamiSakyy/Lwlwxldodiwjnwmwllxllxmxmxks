package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class te0 {
    public final pz0.o5 a;

    public te0(pz0.o5 o5Var) {
        this.a = o5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te0) && this.a == ((te0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContributionDay(contributionLevel=" + this.a + ")";
    }
}
