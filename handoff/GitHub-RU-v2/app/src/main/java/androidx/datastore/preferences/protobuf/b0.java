package androidx.datastore.preferences.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public i0[] f2260a;

    @Override // androidx.datastore.preferences.protobuf.i0
    public final s0 a(Class cls) {
        for (i0 i0Var : this.f2260a) {
            if (i0Var.b(cls)) {
                return i0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean b(Class cls) {
        for (i0 i0Var : this.f2260a) {
            if (i0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
