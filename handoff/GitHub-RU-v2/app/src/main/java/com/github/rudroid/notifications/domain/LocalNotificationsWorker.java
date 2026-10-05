package com.github.rudroid.notifications.domain;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import sy.y;
import v71.b0;
import v71.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class LocalNotificationsWorker extends CoroutineWorker {
    public static final a Companion = new a();

    /* renamed from: g, reason: collision with root package name */
    public final k f17118g;

    /* renamed from: h, reason: collision with root package name */
    public final v f17119h;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalNotificationsWorker(Context context, WorkerParameters workerParameters, k kVar, v vVar) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "params");
        k71.k.g(kVar, "pullLocalNotificationsUseCase");
        k71.k.g(vVar, "dispatcher");
        this.f17118g = kVar;
        this.f17119h = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        d dVar;
        int i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f17130w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f17130w = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f17128u;
                b71.a aVar = b71.a.r;
                i = dVar.f17130w;
                if (i != 0) {
                    y.j(obj);
                    f fVar = new f(this, null);
                    dVar.f17130w = 1;
                    obj = b0.k(fVar, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                k71.k.f(obj, "coroutineScope(...)");
                return obj;
            }
        }
        dVar = new d(this, (c71.c) cVar);
        Object obj2 = dVar.f17128u;
        b71.a aVar2 = b71.a.r;
        i = dVar.f17130w;
        if (i != 0) {
        }
        k71.k.f(obj2, "coroutineScope(...)");
        return obj2;
    }



}
