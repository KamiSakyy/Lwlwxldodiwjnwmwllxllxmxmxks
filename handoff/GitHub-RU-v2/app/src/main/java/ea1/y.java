package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class y extends n {
    public n a;
    public boolean b;

    public y(n nVar) {
        ThreadLocal.withInitial(new ba1.b(5));
        this.a = nVar;
        this.b = nVar.b();
    }

    @Override // ea1.n
    public final boolean b() {
        return this.b;
    }
}
