package h41;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e implements Runnable {
    public w21.g r;

    public e() {
        this.r = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            w21.g gVar = this.r;
            if (gVar != null) {
                gVar.b(e);
            }
        }
    }

    public e(w21.g gVar) {
        this.r = gVar;
    }
}
