package com.github.centrallogger;

import a61.g0;
import a71.c;
import ai.b;
import android.content.Context;
import android.net.NetworkRequest;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b71.a;
import bi.d;
import e9.i;
import java.util.LinkedHashSet;
import k71.k;
import v71.b0;
import v71.v;
import v8.f;
import v8.y;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CentralUsageWorker extends CoroutineWorker {
    public static final b Companion = new b();
    public static final f i;
    public v g;
    public d h;

    static {
        y yVar = y.r;
        i = new f(new i((NetworkRequest) null), y.s, false, false, true, false, -1L, -1L, m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CentralUsageWorker(Context context, WorkerParameters workerParameters, v vVar, d dVar) {
        super(context, workerParameters);
        k.g(context, "context");
        k.g(workerParameters, "params");
        k.g(vVar, "ioDispatcher");
        k.g(dVar, "loggerService");
        this.g = vVar;
        this.h = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(c cVar) {
        ai.c cVar2;
        int i2;
        if (cVar instanceof ai.c) {
            cVar2 = (ai.c) cVar;
            int i3 = cVar2.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.w = i3 - Integer.MIN_VALUE;
                Object obj = cVar2.u;
                a aVar = a.r;
                i2 = cVar2.w;
                if (i2 != 0) {
                    sy.y.j(obj);
                    g0 g0Var = new g0(this, (c) null, 2);
                    cVar2.w = 1;
                    obj = b0.k(g0Var, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                k.f(obj, "coroutineScope(...)");
                return obj;
            }
        }
        cVar2 = new ai.c(this, (c71.c) cVar);
        Object obj2 = cVar2.u;
        a aVar2 = a.r;
        i2 = cVar2.w;
        if (i2 != 0) {
        }
        k.f(obj2, "coroutineScope(...)");
        return obj2;
    }
}
