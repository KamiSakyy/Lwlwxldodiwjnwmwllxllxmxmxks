package q71;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends e {

    /* renamed from: u, reason: collision with root package name */
    public static final g f31003u = new g(1, 0, 1);

    public final boolean a(int i) {
        return this.f30996r <= i && i <= this.f30997s;
    }

    @Override // q71.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f30996r == gVar.f30996r && this.f30997s == gVar.f30997s;
    }

    @Override // q71.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f30996r * 31) + this.f30997s;
    }

    @Override // q71.e
    public final boolean isEmpty() {
        return this.f30996r > this.f30997s;
    }

    @Override // q71.e
    public final String toString() {
        return this.f30996r + ".." + this.f30997s;
    }

    public g(Object... a) {
    }
    public g(Object p1, Object p2, boolean p3, Object p4, boolean p5, boolean p6, boolean p7, boolean p8, String p9, boolean p10, Object p11, java.util.List p12, Object p13, boolean p14, boolean p15) {
    }
}
