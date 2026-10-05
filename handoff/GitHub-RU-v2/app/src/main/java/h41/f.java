package h41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends e {
    public final /* synthetic */ w21.g s;
    public final /* synthetic */ g41.d t;
    public final /* synthetic */ h u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, w21.g gVar, w21.g gVar2, g41.d dVar) {
        super(gVar);
        this.s = gVar2;
        this.t = dVar;
        this.u = hVar;
    }

    @Override // h41.e
    public final void a() {
        synchronized (this.u.f) {
            try {
                h hVar = this.u;
                w21.g gVar = this.s;
                hVar.e.add(gVar);
                gVar.a.b(new e51.a(hVar, gVar, false, 11));
                if (this.u.k.getAndIncrement() > 0) {
                    this.u.b.f("Already connected to the service.", new Object[0]);
                }
                h.b(this.u, this.t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
