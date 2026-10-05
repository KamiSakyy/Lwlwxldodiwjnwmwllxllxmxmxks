package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ua0 {
    public final sa0 a;

    public ua0(sa0 sa0Var) {
        this.a = sa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua0) && k71.k.b(this.a, ((ua0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ContributionsCollection(contributionCalendar=" + this.a + ")";
    }
}
