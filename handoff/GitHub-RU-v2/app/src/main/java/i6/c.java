package i6;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f26022c = new c(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final c f26023d = new c(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final c f26024e = new c(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f26025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26026b;

    public c(int i, int i10) {
        this.f26025a = i;
        this.f26026b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k71.k.e(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        c cVar = (c) obj;
        return this.f26025a == cVar.f26025a && this.f26026b == cVar.f26026b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26026b) + (Integer.hashCode(this.f26025a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) a.b(this.f26025a)) + ", vertical=" + ((Object) b.b(this.f26026b)) + ')';
    }
}
