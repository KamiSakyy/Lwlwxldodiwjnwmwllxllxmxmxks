package w3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends k71.l implements j71.c {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33276s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f33277t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(w wVar, int i) {
        super(1);
        this.f33276s = i;
        this.f33277t = wVar;
    }

    public final Object k(Object obj) {
        switch (this.f33276s) {
            case k5.f.J:
                androidx.compose.ui.layout.w N = ((androidx.compose.ui.layout.w) obj).N();
                k71.k.d(N);
                this.f33277t.n(N);
                break;
            case 1:
                s3.l lVar = new s3.l(((s3.l) obj).f31703a);
                w wVar = this.f33277t;
                wVar.m89setPopupContentSizefhxjrPA(lVar);
                wVar.o();
                break;
            default:
                j71.a aVar = (j71.a) obj;
                w wVar2 = this.f33277t;
                Handler handler = wVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.a();
                } else {
                    Handler handler2 = wVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new v3.a(4, aVar));
                    }
                }
                break;
        }
        return w61.a0.a;
    }







}
