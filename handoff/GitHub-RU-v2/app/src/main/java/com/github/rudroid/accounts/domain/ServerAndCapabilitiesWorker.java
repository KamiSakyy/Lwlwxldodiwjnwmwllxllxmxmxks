package com.github.rudroid.accounts.domain;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import k71.k;
import sy.y;
import v71.b0;
import v71.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class ServerAndCapabilitiesWorker extends CoroutineWorker {
    public static final a Companion = new a();

    /* renamed from: g, reason: collision with root package name */
    public final v f4359g;

    /* renamed from: h, reason: collision with root package name */
    public final ji.c f4360h;
    public final ji.e i;

    /* renamed from: j, reason: collision with root package name */
    public final com.github.rudroid.featureflags.f f4361j;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerAndCapabilitiesWorker(Context context, WorkerParameters workerParameters, v vVar, ji.c cVar, ji.e eVar, com.github.rudroid.featureflags.f fVar) {
        super(context, workerParameters);
        k.g(context, "context");
        k.g(workerParameters, "params");
        k.g(vVar, "dispatcher");
        k.g(cVar, "refreshCapabilitiesUseCase");
        k.g(eVar, "refreshEnterpriseVersionUseCase");
        k.g(fVar, "refreshEnabledFeatureFlagsUseCase");
        this.f4359g = vVar;
        this.f4360h = cVar;
        this.i = eVar;
        this.f4361j = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        com.github.rudroid.accounts.domain.a aVar;
        int i;
        if (cVar instanceof com.github.rudroid.accounts.domain.a) {
            aVar = (com.github.rudroid.accounts.domain.a) cVar;
            int i10 = aVar.f4364w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4364w = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f4362u;
                b71.a aVar2 = b71.a.r;
                i = aVar.f4364w;
                if (i != 0) {
                    y.j(obj);
                    c cVar2 = new c(this, null);
                    aVar.f4364w = 1;
                    obj = b0.k(cVar2, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                k.f(obj, "coroutineScope(...)");
                return obj;
            }
        }
        aVar = new com.github.rudroid.accounts.domain.a(this, (c71.c) cVar);
        Object obj2 = aVar.f4362u;
        b71.a aVar22 = b71.a.r;
        i = aVar.f4364w;
        if (i != 0) {
        }
        k.f(obj2, "coroutineScope(...)");
        return obj2;
    }
}
