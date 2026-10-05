package v1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a0 implements z {

    /* renamed from: r, reason: collision with root package name */
    public final r1.a f32336r = new r1.a(0);

    public final boolean o(int i) {
        return (i & this.f32336r.get()) != 0;
    }

    public final void r(int i) {
        r1.a aVar;
        int i10;
        do {
            aVar = this.f32336r;
            i10 = aVar.get();
            if ((i10 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i));
    }
}
