package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ts {
    public vs a;

    public ts(vs vsVar) {
        this.a = vsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts) && k71.k.b(this.a, ((ts) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(watchers=" + this.a + ")";
    }
}
