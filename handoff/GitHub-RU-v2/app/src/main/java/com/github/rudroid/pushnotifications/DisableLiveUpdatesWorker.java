package com.github.rudroid.pushnotifications;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.LinkedHashSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class DisableLiveUpdatesWorker extends CoroutineWorker {
    public static final a Companion = new a();

    /* renamed from: k, reason: collision with root package name */
    public static final v8.f f18512k;

    /* renamed from: g, reason: collision with root package name */
    public oa.m f18513g;

    /* renamed from: h, reason: collision with root package name */
    public sm.g f18514h;
    public com.github.rudroid.utilities.e i;

    /* renamed from: j, reason: collision with root package name */
    public v71.v f18515j;

    public static final class a {
    }

    static {
        v8.y yVar = v8.y.f32849r;
        f18512k = new v8.f(new e9.i(null), v8.y.f32850s, false, false, true, false, -1L, -1L, x61.m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableLiveUpdatesWorker(Context context, WorkerParameters workerParameters, oa.m mVar, sm.g gVar, com.github.rudroid.utilities.e eVar, v71.v vVar) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "params");
        k71.k.g(mVar, "userManager");
        k71.k.g(gVar, "updatePushNotificationSettingUseCase");
        k71.k.g(eVar, "analytics");
        k71.k.g(vVar, "dispatcher");
        this.f18513g = mVar;
        this.f18514h = gVar;
        this.i = eVar;
        this.f18515j = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f18529w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f18529w = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f18527u;
                b71.a aVar = b71.a.r;
                i = bVar.f18529w;
                if (i != 0) {
                    sy.y.j(obj);
                    c cVar2 = new c(this, null);
                    bVar.f18529w = 1;
                    obj = v71.b0.L(this.f18515j, cVar2, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                k71.k.f(obj, "withContext(...)");
                return obj;
            }
        }
        bVar = new b(this, (c71.c) cVar);
        Object obj2 = bVar.f18527u;
        b71.a aVar2 = b71.a.r;
        i = bVar.f18529w;
        if (i != 0) {
        }
        k71.k.f(obj2, "withContext(...)");
        return obj2;
    }
}
