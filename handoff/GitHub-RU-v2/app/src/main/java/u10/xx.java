package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xx implements aa.v0 {
    public final cy a;

    public xx(cy cyVar) {
        this.a = cyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx) && k71.k.b(this.a, ((xx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
