package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qu {
    public tu a;

    public qu(tu tuVar) {
        this.a = tuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu) && k71.k.b(this.a, ((qu) obj).a);
    }

    public final int hashCode() {
        tu tuVar = this.a;
        if (tuVar == null) {
            return 0;
        }
        return tuVar.hashCode();
    }

    public final String toString() {
        return "Tagger(user=" + this.a + ")";
    }
}
