package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class es {
    public final bs a;

    public es(bs bsVar) {
        this.a = bsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es) && k71.k.b(this.a, ((es) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(forks=" + this.a + ")";
    }
}
