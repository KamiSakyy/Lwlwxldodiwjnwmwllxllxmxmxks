package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dk {
    public final uj a;

    public dk(uj ujVar) {
        this.a = ujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk) && k71.k.b(this.a, ((dk) obj).a);
    }

    public final int hashCode() {
        uj ujVar = this.a;
        if (ujVar == null) {
            return 0;
        }
        return ujVar.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(mentionableItems=" + this.a + ")";
    }
}
