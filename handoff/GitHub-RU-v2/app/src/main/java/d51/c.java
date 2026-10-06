package d51;

import a5.s;
import a81.t;
import android.util.Log;
import b1.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import v41.l;
import v41.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                d dVar = (d) ((m) this.b).t;
                t tVar = (t) dVar.f;
                f fVar = (f) dVar.b;
                tVar.getClass();
                w41.c.b();
                try {
                    HashMap b = t.b(fVar);
                    s sVar = new s(tVar.s, b);
                    sVar.v("User-Agent", "Crashlytics Android SDK/19.4.4");
                    sVar.v("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    t.a(sVar, fVar);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    b.toString();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    a51.a r = sVar.r();
                    int i = r.b;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    if (i == 200 || i == 201 || i == 202 || i == 203) {
                        return new JSONObject(r.a);
                    }
                    return null;
                } catch (IOException | Exception unused) {
                    return null;
                }
            default:
                l lVar = ((p) this.b).h;
                lVar.getClass();
                w41.c.a();
                v2.t tVar2 = lVar.c;
                b51.dShadow dVar2 = (b51.dShadow) tVar2.t;
                String str = (String) tVar2.s;
                dVar2.getClass();
                boolean z = true;
                if (new File((File) dVar2.c, str).exists()) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    b51.dShadow dVar3 = (b51.dShadow) tVar2.t;
                    dVar3.getClass();
                    new File((File) dVar3.c, str).delete();
                } else {
                    String d = lVar.d();
                    if (d == null || !lVar.j.c(d)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
