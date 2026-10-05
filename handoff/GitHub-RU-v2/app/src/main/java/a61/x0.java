package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements d61.b {
    public final /* synthetic */ int a = 0;
    public final v61.a b;
    public final v61.a c;
    public final v61.a d;
    public final v61.a e;
    public final v61.a f;

    public x0(d61.c cVar, v61.a aVar, v61.a aVar2, v61.a aVar3, v61.a aVar4) {
        this.f = cVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [c61.a] */
    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new w0((k41.g) ((d61.c) this.f).a, (q51.d) this.b.get(), (e61.g) this.c.get(), (l) this.d.get(), (a71.h) this.e.get());
            default:
                a71.h hVar = (a71.h) this.b.get();
                q51.d dVar = (q51.d) this.c.get();
                b bVar = (b) this.d.get();
                e61.d dVar2 = (e61.d) this.e.get();
                v61.a aVar = this.f;
                return new e61.c(hVar, dVar, bVar, dVar2, aVar instanceof c61.a ? (c61.a) aVar : new d61.a(aVar));
        }
    }

    public x0(v61.a aVar, v61.a aVar2, v61.a aVar3, v61.a aVar4, v61.a aVar5) {
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
    }

    public x0(Object... a) {
    }
}
