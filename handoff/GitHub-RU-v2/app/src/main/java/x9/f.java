package x9;

import java.io.Serializable;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements w21.c {

    /* renamed from: r, reason: collision with root package name */
    public Serializable f33999r;

    /* renamed from: s, reason: collision with root package name */
    public Object f34000s;

    /* renamed from: t, reason: collision with root package name */
    public Object f34001t;

    public void x(w21.o oVar) {
        y11.b bVar = (y11.b) this.f34000s;
        String str = (String) this.f33999r;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f34001t;
        synchronized (bVar.a) {
            bVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
    public Object r = null;
    public Object s = null;
    public Object t = null;
}
