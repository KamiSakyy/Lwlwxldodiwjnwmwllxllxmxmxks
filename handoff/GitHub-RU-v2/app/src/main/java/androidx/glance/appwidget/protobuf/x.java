package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class x implements Cloneable {

    /* renamed from: r, reason: collision with root package name */
    public final z f2804r;

    /* renamed from: s, reason: collision with root package name */
    public z f2805s;

    public x(z zVar) {
        this.f2804r = zVar;
        if (zVar.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2805s = zVar.j();
    }

    public static void d(Object obj, Object obj2) {
        w0 w0Var = w0.f2801c;
        w0Var.getClass();
        w0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final z a() {
        z b10 = b();
        b10.getClass();
        if (z.g(b10, true)) {
            return b10;
        }
        throw new UninitializedMessageException();
    }

    public final z b() {
        if (!this.f2805s.h()) {
            return this.f2805s;
        }
        z zVar = this.f2805s;
        zVar.getClass();
        w0 w0Var = w0.f2801c;
        w0Var.getClass();
        w0Var.a(zVar.getClass()).b(zVar);
        zVar.i();
        return this.f2805s;
    }

    public final void c() {
        if (this.f2805s.h()) {
            return;
        }
        z j10 = this.f2804r.j();
        d(j10, this.f2805s);
        this.f2805s = j10;
    }

    public final Object clone() {
        x xVar = (x) this.f2804r.d(5);
        xVar.f2805s = b();
        return xVar;
    }
}
