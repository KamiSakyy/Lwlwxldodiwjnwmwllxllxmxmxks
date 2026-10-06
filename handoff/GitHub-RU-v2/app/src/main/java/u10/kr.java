package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kr {
    public gr a;

    public kr(gr grVar) {
        this.a = grVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kr) && k71.k.b(this.a, ((kr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(contributors=" + this.a + ")";
    }
}
