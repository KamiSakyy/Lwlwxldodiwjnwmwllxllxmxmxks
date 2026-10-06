package w51;

import android.content.Context;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a0 implements w21.c, w7.b, o31.k {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ a0(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public float a(float f) {
        return ((y3.p) this.s).k.b() * f;
    }

    public w7.c d(o31.a aVar) {
        Context context = (Context) this.s;
        String str = (String) aVar.d;
        b21.v vVar = (b21.v) aVar.e;
        k71.k.g(vVar, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new androidx.sqlite.db.framework.f(context, str, vVar, true, true);
    }

    @Override // w21.c
    public void x(w21.o oVar) {
        switch (this.r) {
            case 0:
                ((c0) this.s).b.c(null);
                break;
            default:
                ((ScheduledFuture) this.s).cancel(false);
                break;
        }
    }

    public a0(Object... a) {
    }
    public Object b(Object p1) { return null; }
    public Object c() { return null; }
    public Object C = null;
    public Object V = null;
    public Object w = null;
}
