package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import android.net.NetworkRequest;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b6.q0;
import com.github.rudroid.widget.agenttasks.e;
import com.github.rudroid.widget.agenttasks.model.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTasksWidgetWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public static final v8.f h;
    public final Context g;

    public static final class a {
        public static void a(Context context) {
            k71.k.g(context, "context");
            w8.q Z = w8.q.Z(context);
            k71.k.f(Z, "getInstance(...)");
            Z.s("AgentTasksWidgetWorker", v8.n.s, new v8.z(AgentTasksWidgetWorker.class).e(AgentTasksWidgetWorker.h).d(v8.a.r, 10000L, TimeUnit.MILLISECONDS).a());
        }
    }

    static {
        v8.y yVar = v8.y.r;
        h = new v8.f(new e9.i((NetworkRequest) null), v8.y.s, false, false, false, false, -1L, -1L, x61.m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentTasksWidgetWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "workerParameters");
        this.g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r1 == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e1 -> B:23:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        w wVar;
        int i;
        e a2;
        com.github.rudroid.widget.agenttasks.model.c cVar2;
        Iterator it;
        e eVar;
        com.github.rudroid.widget.agenttasks.model.c cVar3;
        int i2;
        int i3;
        Collection collection;
        int i4;
        Iterator it2;
        int i5;
        com.github.rudroid.widget.agenttasks.model.c cVar4;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i6 = wVar.E;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                wVar.E = i6 - Integer.MIN_VALUE;
                Object obj = wVar.C;
                b71.a aVar = b71.a.r;
                i = wVar.E;
                int i7 = 2;
                if (i != 0) {
                    sy.y.j(obj);
                    Context context = this.g;
                    q0 q0Var = new q0(context);
                    com.github.rudroid.widget.agenttasks.model.c.Companion.getClass();
                    k71.k.g(context, "context");
                    Object v = k41.b.v(c.a.class, context.getApplicationContext());
                    k71.k.f(v, "get(...)");
                    com.github.rudroid.widget.agenttasks.model.c d = ((c.a) v).d();
                    e.Companion.getClass();
                    a2 = e.b.a(context);
                    wVar.u = d;
                    wVar.v = a2;
                    wVar.E = 1;
                    obj = q0Var.c(d.class, wVar);
                    if (obj != aVar) {
                        cVar2 = d;
                    }
                    return aVar;
                }
                if (i == 1) {
                    a2 = wVar.v;
                    cVar2 = wVar.u;
                    sy.y.j(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = wVar.z;
                        oa.j jVar = wVar.x;
                        it2 = (Iterator) wVar.w;
                        cVar4 = wVar.u;
                        sy.y.j(obj);
                        while (it2.hasNext()) {
                            oa.j jVar2 = (oa.j) ((w61.k) it2.next()).r;
                            wVar.u = cVar4;
                            wVar.v = null;
                            wVar.w = it2;
                            wVar.x = null;
                            wVar.y = null;
                            wVar.z = i5;
                            wVar.A = 0;
                            wVar.E = 3;
                            if (cVar4.b(jVar2, wVar) == aVar) {
                                return aVar;
                            }
                        }
                        return v8.v.a();
                    }
                    i2 = wVar.B;
                    i3 = wVar.A;
                    i4 = wVar.z;
                    z5.k kVar = wVar.y;
                    it = wVar.x;
                    collection = (Collection) wVar.w;
                    eVar = wVar.v;
                    cVar3 = wVar.u;
                    sy.y.j(obj);
                    oa.j jVar3 = (oa.j) obj;
                    w61.k kVar2 = jVar3 == null ? null : new w61.k(jVar3, kVar);
                    if (kVar2 != null) {
                        collection.add(kVar2);
                    }
                    i7 = 2;
                    if (!it.hasNext()) {
                        it2 = ((List) collection).iterator();
                        i5 = 0;
                        cVar4 = cVar3;
                        while (it2.hasNext()) {
                        }
                        return v8.v.a();
                    }
                    kVar = (z5.k) it.next();
                    wVar.u = cVar3;
                    wVar.v = eVar;
                    wVar.w = collection;
                    wVar.x = it;
                    wVar.y = kVar;
                    wVar.z = i4;
                    wVar.A = i3;
                    wVar.B = i2;
                    wVar.E = i7;
                    obj = eVar.b(kVar, wVar);
                }
                ArrayList arrayList = new ArrayList();
                it = ((List) obj).iterator();
                eVar = a2;
                cVar3 = cVar2;
                i2 = 0;
                i3 = 0;
                collection = arrayList;
                i4 = 0;
                if (!it.hasNext()) {
                }
            }
        }
        wVar = new w(this, (c71.c) cVar);
        Object obj2 = wVar.C;
        b71.a aVar2 = b71.a.r;
        i = wVar.E;
        int i72 = 2;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        it = ((List) obj2).iterator();
        eVar = a2;
        cVar3 = cVar2;
        i2 = 0;
        i3 = 0;
        collection = arrayList2;
        i4 = 0;
        if (!it.hasNext()) {
        }
    }
}
