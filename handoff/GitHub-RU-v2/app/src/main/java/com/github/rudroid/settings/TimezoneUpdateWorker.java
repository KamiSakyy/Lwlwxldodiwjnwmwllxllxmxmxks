package com.github.rudroid.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkRequest;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class TimezoneUpdateWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public static final v8.f k;
    public mm.w g;
    public oa.m h;
    public com.github.rudroid.utilities.v2 i;
    public SharedPreferences j;

    public static final class a {
        public static void a(Context context, boolean z) {
            v8.z d = new v8.z(TimezoneUpdateWorker.class).e(TimezoneUpdateWorker.k).d(v8.a.r, 10000L, TimeUnit.MILLISECONDS);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("force_update", Boolean.valueOf(z));
            v8.i iVar = new v8.i(linkedHashMap);
            sy.tShadow.r(iVar);
            v8.a0 a = d.g(iVar).a();
            w8.q Z = w8.q.Z(context);
            k71.k.f(Z, "getInstance(...)");
            Z.s("TimezoneUpdateWorker", v8.n.r, a);
        }
    }

    static {
        v8.y yVar = v8.y.r;
        k = new v8.f(new e9.i((NetworkRequest) null), v8.y.s, false, false, false, false, -1L, -1L, x61.m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimezoneUpdateWorker(Context context, WorkerParameters workerParameters, mm.w wVar, oa.m mVar, com.github.rudroid.utilities.v2 v2Var) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "params");
        k71.k.g(wVar, "updateUserTimezoneUseCase");
        k71.k.g(mVar, "userManager");
        k71.k.g(v2Var, "timeZoneUtils");
        this.g = wVar;
        this.h = mVar;
        this.i = v2Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("TimezoneUpdateWorker", 0);
        k71.k.f(sharedPreferences, "getSharedPreferences(...)");
        this.j = sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r7.equals(r12) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:11:0x0035, B:13:0x00a0, B:15:0x00a6, B:22:0x00c4, B:28:0x0044, B:31:0x006a, B:35:0x0077, B:38:0x007f, B:40:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        l3 l3Var;
        int i;
        WorkerParameters workerParameters;
        String str;
        Iterable iterable;
        int i2;
        Iterator it;
        boolean z;
        int i3;
        try {
            if (cVar instanceof l3) {
                l3Var = (l3) cVar;
                int i4 = l3Var.C;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    l3Var.C = i4 - Integer.MIN_VALUE;
                    Object obj = l3Var.A;
                    Object obj2 = b71.a.r;
                    i = l3Var.C;
                    workerParameters = ((v8.w) this).b;
                    if (i != 0) {
                        sy.y.j(obj);
                        this.i.getClass();
                        String id = TimeZone.getDefault().getID();
                        k71.k.f(id, "getID(...)");
                        v8.i iVar = workerParameters.b;
                        iVar.getClass();
                        Object obj3 = Boolean.FALSE;
                        Object obj4 = iVar.a.get("force_update");
                        if (obj4 instanceof Boolean) {
                            obj3 = obj4;
                        }
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        SharedPreferences sharedPreferences = this.j;
                        if (!booleanValue) {
                            String string = sharedPreferences.getString("app_time_zone", null);
                            if (string == null) {
                                string = "";
                            }
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("app_time_zone", id);
                        edit.apply();
                        ArrayList e = this.h.e();
                        Iterator it2 = e.iterator();
                        str = id;
                        iterable = e;
                        i2 = 0;
                        it = it2;
                        z = booleanValue;
                        i3 = 0;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = l3Var.z;
                        i2 = l3Var.y;
                        z = l3Var.x;
                        it = l3Var.w;
                        iterable = l3Var.v;
                        str = l3Var.u;
                        sy.y.j(obj);
                    }
                    while (it.hasNext()) {
                        oa.j jVar = (oa.j) it.next();
                        l3Var.u = str;
                        l3Var.v = iterable;
                        l3Var.w = it;
                        l3Var.x = z;
                        l3Var.y = i2;
                        l3Var.z = i3;
                        l3Var.C = 1;
                        if (e(jVar, str, l3Var) == obj2) {
                            return obj2;
                        }
                    }
                    return v8.v.a();
                }
            }
            if (i != 0) {
            }
            while (it.hasNext()) {
            }
            return v8.v.a();
        } catch (Throwable unused) {
            return workerParameters.c < 5 ? new v8.t() : new v8.s();
        }
        l3Var = new l3(this, (c71.c) cVar);
        Object obj5 = l3Var.A;
        Object obj22 = b71.a.r;
        i = l3Var.C;
        workerParameters = ((v8.w) this).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(oa.j jVar, String str, c71.c cVar) {
        m3 m3Var;
        int i;
        if (cVar instanceof m3) {
            m3Var = (m3) cVar;
            int i2 = m3Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3Var.w = i2 - Integer.MIN_VALUE;
                Object obj = m3Var.u;
                b71.a aVar = b71.a.r;
                i = m3Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(20);
                    m3Var.w = 1;
                    obj = this.g.a(jVar, str, a0Var, m3Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                m3Var.w = 2;
                Object F = y71.n1Shadow.F((y71.i) obj, m3Var);
                return F != aVar ? aVar : F;
            }
        }
        m3Var = new m3(this, cVar);
        Object obj2 = m3Var.u;
        b71.a aVar2 = b71.a.r;
        i = m3Var.w;
        if (i != 0) {
        }
        m3Var.w = 2;
        Object F2 = y71.n1Shadow.F((y71.i) obj2, m3Var);
        if (F2 != aVar2) {
        }
    }
}
