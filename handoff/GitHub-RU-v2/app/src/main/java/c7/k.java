package c7;

import android.window.OnBackInvokedCallback;
import k.z;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4152b;

    public /* synthetic */ k(int i, Object obj) {
        this.f4151a = i;
        this.f4152b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4151a) {
            case k5.f.J:
                ((m) this.f4152b).a();
                break;
            case 1:
                ((z) this.f4152b).I();
                break;
            case 2:
                ((p31.b) this.f4152b).b();
                break;
            case 3:
                ((Runnable) this.f4152b).run();
                break;
            default:
                j71.a aVar = (j71.a) this.f4152b;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
        }
    }
}
