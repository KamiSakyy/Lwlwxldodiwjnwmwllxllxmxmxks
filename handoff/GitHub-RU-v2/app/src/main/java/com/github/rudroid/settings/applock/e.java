package com.github.rudroid.settings.applock;

import a61.l0;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.z3;
import java.util.concurrent.TimeUnit;
import y71.n1Shadow;
import y71.y1;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockAuthenticationStore$fetchAndUpdateAppLockUiModel$1", f = "AppLockAuthenticationStore.kt", l = {53}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r7 >= r3.longValue()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object value;
        boolean z;
        k kVar = this.w;
        y1 y1Var = kVar.f;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            com.github.rudroid.settings.applock.usecases.a aVar2 = kVar.a;
            l0 G = z3.G(aVar2.a.getData(), new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(25, aVar2));
            this.v = 1;
            obj = n1Shadow.v(G, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        yf.b bVar = (yf.b) obj;
        if (bVar != null) {
            do {
                value = y1Var.getValue();
                ((Boolean) value).getClass();
                Long l = bVar.d;
                z = false;
                if (bVar.a) {
                    if (!bVar.c) {
                        if (l != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime < TimeUnit.MILLISECONDS.convert(bVar.b, TimeUnit.MINUTES) + l.longValue()) {
                            }
                        }
                    }
                    z = true;
                }
            } while (!y1Var.i(value, Boolean.valueOf(z)));
            if (((Boolean) y1Var.getValue()).booleanValue()) {
                v71.b0.z(kVar.e, (a71.h) null, (v71.a0Shadow) null, new f(kVar, null), 3);
            }
        }
        return w61.a0.a;
    }
}
