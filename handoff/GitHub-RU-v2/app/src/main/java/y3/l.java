package y3;

import android.os.Handler;
import android.os.Looper;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class l extends k71.l implements j71.c {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34219s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f34220t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i) {
        super(1);
        this.f34219s = i;
        this.f34220t = mVar;
    }

    public final Object k(Object obj) {
        switch (this.f34219s) {
            case k5.f.J /* 0 */:
                j71.a aVar = (j71.a) obj;
                if (k71.k.b(Looper.myLooper(), Looper.getMainLooper())) {
                    aVar.a();
                } else {
                    m mVar = this.f34220t;
                    Handler handler = mVar.f34222s;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        mVar.f34222s = handler;
                    }
                    handler.post(new v3.a(6, aVar));
                }
                break;
            default:
                this.f34220t.f34224u = true;
                break;
        }
        return a0.a;
    }
}
