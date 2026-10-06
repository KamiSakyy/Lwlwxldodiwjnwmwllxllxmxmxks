package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dt {
    public ft a;

    public dt(ft ftVar) {
        this.a = ftVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt) && k71.k.b(this.a, ((dt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnReactable(reactions=" + this.a + ")";
    }
}
