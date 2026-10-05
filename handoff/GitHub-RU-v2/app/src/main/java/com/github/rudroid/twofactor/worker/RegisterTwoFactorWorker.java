package com.github.rudroid.twofactor.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.github.rudroid.pushnotifications.e0;
import dn.z;
import k71.k;
import sy.y;
import v8.t;
import v8.v;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RegisterTwoFactorWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public final z g;
    public final e0 h;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterTwoFactorWorker(Context context, WorkerParameters workerParameters, z zVar, e0 e0Var) {
        super(context, workerParameters);
        k.g(context, "context");
        k.g(workerParameters, "params");
        k.g(zVar, "authHandler");
        k.g(e0Var, "pushNotificationTokenManager");
        this.g = zVar;
        this.h = e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r6.a(r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        com.github.rudroid.twofactor.worker.a aVar;
        int i;
        try {
            if (cVar instanceof com.github.rudroid.twofactor.worker.a) {
                aVar = (com.github.rudroid.twofactor.worker.a) cVar;
                int i2 = aVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.u;
                    b71.a aVar2 = b71.a.r;
                    i = aVar.w;
                    if (i != 0) {
                        y.j(obj);
                        e0 e0Var = this.h;
                        aVar.w = 1;
                        if (e0Var.a(aVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj);
                            return v.a();
                        }
                        y.j(obj);
                    }
                    z zVar = this.g;
                    aVar.w = 2;
                }
            }
            if (i != 0) {
            }
            z zVar2 = this.g;
            aVar.w = 2;
        } catch (Exception unused) {
            return new t();
        }
        aVar = new com.github.rudroid.twofactor.worker.a(this, (c71.c) cVar);
        Object obj2 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.w;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e0<T1,T2,T3,T4> {
        public e0() {
        }
    }
}
