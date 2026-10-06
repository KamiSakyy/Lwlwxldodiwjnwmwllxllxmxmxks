package a61;

import android.app.Application;
import android.content.Context;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public k41.g a;
    public e61.g b;

    public p(k41.g gVar, e61.g gVar2, a71.h hVar, e1 e1Var) {
        k71.k.g(gVar, "firebaseApp");
        k71.k.g(gVar2, "settings");
        k71.k.g(hVar, "backgroundDispatcher");
        k71.k.g(e1Var, "lifecycleServiceBinder");
        this.a = gVar;
        this.b = gVar2;
        gVar.a();
        Context applicationContext = gVar.a.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(f1.r);
            v71.b0.z(v71.b0.c(hVar), (a71.h) null, (v71.a0Shadow) null, new o(this, hVar, e1Var, null, 0), 3);
        }
    }
}
