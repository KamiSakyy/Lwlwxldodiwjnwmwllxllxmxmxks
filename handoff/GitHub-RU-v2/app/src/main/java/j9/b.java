package j9;

import java.io.Closeable;
import t71.n;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public a f27303r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f27304s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f27305t;

    public b(d dVar, a aVar) {
        this.f27305t = dVar;
        this.f27303r = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f27304s) {
            return;
        }
        this.f27304s = true;
        d dVar = this.f27305t;
        synchronized (dVar) {
            a aVar = this.f27303r;
            int i = aVar.f27302h - 1;
            aVar.f27302h = i;
            if (i == 0 && aVar.f27300f) {
                n nVar = d.H;
                dVar.N(aVar);
            }
        }
    }


}
