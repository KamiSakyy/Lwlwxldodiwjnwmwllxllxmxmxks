package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ww {
    public sw a;

    public ww(sw swVar) {
        this.a = swVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww) && k71.k.b(this.a, ((ww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(contributors=" + this.a + ")";
    }
}
