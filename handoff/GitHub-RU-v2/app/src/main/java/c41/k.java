package c41;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements Runnable {
    public final w21.g r;

    public k() {
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

    public k(w21.g gVar) {
        this.r = gVar;
    }
}
