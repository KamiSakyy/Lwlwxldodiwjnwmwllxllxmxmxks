package i6;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements z5.h {

    /* renamed from: a, reason: collision with root package name */
    public z5.n f26044a = z5.l.f34585a;

    @Override // z5.h
    public final z5.h a() {
        l lVar = new l();
        lVar.f26044a = this.f26044a;
        return lVar;
    }

    @Override // z5.h
    public final void b(z5.n nVar) {
        this.f26044a = nVar;
    }

    @Override // z5.h
    public final z5.n c() {
        return this.f26044a;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.f26044a + ')';
    }
    public Object o = null;
}
