package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public v a;

    public d(v vVar) {
        this.a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAchievementRepositoryList(repositories=" + this.a + ")";
    }
}
