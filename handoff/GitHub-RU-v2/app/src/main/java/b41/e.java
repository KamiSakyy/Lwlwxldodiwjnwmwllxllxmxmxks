package b41;

import a81.t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.rudroid.home.a2;
import com.google.android.play.core.install.InstallException;
import t.q;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final k a;
    public final c b;
    public final Context c;

    public e(k kVar, c cVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = kVar;
        this.b = cVar;
        this.c = context;
    }

    public static void b(a aVar, a2 a2Var, n nVar) {
        if (aVar == null || aVar.a(nVar) == null || aVar.g) {
            return;
        }
        aVar.g = true;
        IntentSender intentSender = aVar.a(nVar).getIntentSender();
        k71.k.g(intentSender, "intent");
        a2Var.a.a(new h.h(intentSender, (Intent) null, 0, 0));
    }

    public final o a() {
        String packageName = this.c.getPackageName();
        k kVar = this.a;
        c41.o oVar = kVar.a;
        if (oVar != null) {
            k.e.g("requestUpdateInfo(%s)", new Object[]{packageName});
            w21.g gVar = new w21.g();
            oVar.a().post(new g(oVar, gVar, gVar, new g(kVar, gVar, packageName, gVar), 2));
            return gVar.a;
        }
        t tVar = k.e;
        Object[] objArr = {-9};
        tVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            t.i(tVar.s, "onError(%d)", objArr);
        }
        return q.j(new InstallException(-9));
    }
}
