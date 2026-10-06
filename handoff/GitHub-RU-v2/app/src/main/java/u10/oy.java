package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oy {
    public ly a;

    public oy(ly lyVar) {
        this.a = lyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy) && k71.k.b(this.a, ((oy) obj).a);
    }

    public final int hashCode() {
        ly lyVar = this.a;
        if (lyVar == null) {
            return 0;
        }
        return lyVar.hashCode();
    }

    public final String toString() {
        return "ReplaceAssigneesForAssignable(assignable=" + this.a + ")";
    }
}
