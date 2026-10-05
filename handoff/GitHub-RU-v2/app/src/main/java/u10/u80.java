package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u80 {
    public final s80 a;

    public u80(s80 s80Var) {
        this.a = s80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u80) && k71.k.b(this.a, ((u80) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ContributionsCollection(contributionCalendar=" + this.a + ")";
    }



}
