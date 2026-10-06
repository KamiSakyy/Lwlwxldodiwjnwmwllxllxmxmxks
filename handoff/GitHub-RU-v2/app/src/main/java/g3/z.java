package g3;

/* loaded from: /home/user/work/p/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public y f24719a;

    /* renamed from: b, reason: collision with root package name */
    public x f24720b;

    public z(y yVar, x xVar) {
        this.f24719a = yVar;
        this.f24720b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.f24720b, zVar.f24720b) && k71.k.b(this.f24719a, zVar.f24719a);
    }

    public final int hashCode() {
        y yVar = this.f24719a;
        int hashCode = (yVar != null ? yVar.hashCode() : 0) * 31;
        x xVar = this.f24720b;
        return hashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f24719a + ", paragraphSyle=" + this.f24720b + ')';
    }

    public z(boolean z10) {
        this(null, new x(z10));
    }
}
