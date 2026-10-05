package r41;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l51.h;
import l7.x1;
import v41.o;
import z70.w;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements u41.a, t41.a, p51.a {
    public final /* synthetic */ b r;

    @Override // u41.a
    public void c(o oVar) {
        b bVar = this.r;
        synchronized (bVar) {
            try {
                if (((u41.a) bVar.b) instanceof u41.b) {
                    ((ArrayList) bVar.c).add(oVar);
                }
                ((u41.a) bVar.b).c(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t41.a
    public void h(Bundle bundle) {
        ((t41.a) this.r.a).h(bundle);
    }

    @Override // p51.a
    public void k(p51.b bVar) {
        b bVar2 = this.r;
        Log.isLoggable("FirebaseCrashlytics", 3);
        m41.a aVar = (m41.a) bVar.get();
        s21.a aVar2 = new s21.a(5, aVar);
        x1 x1Var = new x1();
        m41.b bVar3 = (m41.b) aVar;
        w b = bVar3.b("clx", x1Var);
        if (b == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            b = bVar3.b("crash", x1Var);
        }
        if (b != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            s21.a aVar3 = new s21.a(4, false);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            h hVar = new h(aVar2, (byte) 0);
            synchronized (bVar2) {
                try {
                    ArrayList arrayList = (ArrayList) bVar2.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        aVar3.c((o) obj);
                    }
                    x1Var.s = aVar3;
                    x1Var.r = hVar;
                    bVar2.b = aVar3;
                    bVar2.a = hVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
