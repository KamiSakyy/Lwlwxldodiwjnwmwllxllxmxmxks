package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public v71.l f1618a;

    /* renamed from: b, reason: collision with root package name */
    public j71.c f1619b;

    @Override // r1.b
    public final void a() {
        this.f1619b = null;
        this.f1618a = null;
    }

    @Override // r1.b
    public final void b(Throwable th) {
        v71.l lVar = this.f1618a;
        if (lVar != null) {
            lVar.i(sy.y.d(th));
        }
    }
}
