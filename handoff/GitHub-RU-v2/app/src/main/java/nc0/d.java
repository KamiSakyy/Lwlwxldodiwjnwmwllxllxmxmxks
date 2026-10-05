package nc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final u a;

    public d(u uVar) {
        this.a = uVar;
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
