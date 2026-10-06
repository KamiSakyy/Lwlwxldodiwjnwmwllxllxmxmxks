package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zi {
    public final ti a;

    public zi(ti tiVar) {
        this.a = tiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi) && k71.k.b(this.a, ((zi) obj).a);
    }

    public final int hashCode() {
        ti tiVar = this.a;
        if (tiVar == null) {
            return 0;
        }
        return tiVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussion(mentionableItems=" + this.a + ")";
    }
}
