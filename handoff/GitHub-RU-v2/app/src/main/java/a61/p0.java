package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 implements d61.b {
    public final /* synthetic */ int a;
    public v61.a b;
    public v61.a c;

    public /* synthetic */ p0(v61.a aVar, v61.a aVar2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new o0((a71.h) this.b.get(), (n5.f) this.c.get());
            case 1:
                return new y0((g1) this.b.get(), (h1) this.c.get());
            case 2:
                return new e61.d((b) this.b.get(), (a71.h) this.c.get());
            default:
                return new e61.g((e61.j) this.b.get(), (e61.j) this.c.get());
        }
    }
}
