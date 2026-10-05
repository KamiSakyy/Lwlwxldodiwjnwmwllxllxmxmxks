package androidx.lifecycle;

import android.app.Application;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a extends k1 {

    /* renamed from: s, reason: collision with root package name */
    public final Application f2819s;

    public a(Application application) {
        k71.k.g(application, "application");
        this.f2819s = application;
    }

    public final Application P() {
        Application application = this.f2819s;
        k71.k.e(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }


}
