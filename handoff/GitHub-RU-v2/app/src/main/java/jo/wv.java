package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wv {
    public xv a;

    public wv(xv xvVar) {
        this.a = xvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv) && k71.k.b(this.a, ((wv) obj).a);
    }

    public final int hashCode() {
        xv xvVar = this.a;
        if (xvVar == null) {
            return 0;
        }
        return xvVar.hashCode();
    }

    public final String toString() {
        return "RemoveStar(starrable=" + this.a + ")";
    }
}
