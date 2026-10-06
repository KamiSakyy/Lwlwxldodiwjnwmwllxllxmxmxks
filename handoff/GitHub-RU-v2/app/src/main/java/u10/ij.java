package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ij {
    public fj a;

    public ij(fj fjVar) {
        this.a = fjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij) && k71.k.b(this.a, ((ij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(mentionableUsers=" + this.a + ")";
    }
}
