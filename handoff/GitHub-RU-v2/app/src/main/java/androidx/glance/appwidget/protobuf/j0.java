package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public o0[] f2741a;

    @Override // androidx.glance.appwidget.protobuf.o0
    public final y0 a(Class cls) {
        for (o0 o0Var : this.f2741a) {
            if (o0Var.b(cls)) {
                return o0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.o0
    public final boolean b(Class cls) {
        for (o0 o0Var : this.f2741a) {
            if (o0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
