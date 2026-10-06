package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public static final b Companion = new b();
    public n5.f a;
    public oa.m b;

    public interface a {
        e b();
    }

    public static final class b {
        public static e a(Context context) {
            k71.k.g(context, "context");
            return ((a) k41.b.v(a.class, context.getApplicationContext())).b();
        }
    }

    public e(n5.f fVar, oa.m mVar) {
        k71.k.g(fVar, "dataStore");
        k71.k.g(mVar, "userManager");
        this.a = fVar;
        this.b = mVar;
    }

    public static String c(z5.k kVar) {
        return "selected_agent_tasks_user" + kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z5.k kVar, c71.c cVar) {
        g gVar;
        int i;
        s5.e Q;
        s5.b bVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.x = i2 - Integer.MIN_VALUE;
                Object obj = gVar.v;
                b71.a aVar = b71.a.r;
                i = gVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    Q = b91.g.Q(c(kVar));
                    y71.i data = this.a.getData();
                    gVar.u = Q;
                    gVar.x = 1;
                    obj = n1Shadow.v(data, gVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q = gVar.u;
                    sy.y.j(obj);
                }
                bVar = (s5.b) obj;
                if (bVar == null) {
                    return (String) bVar.d(Q);
                }
                return null;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.v;
        b71.a aVar2 = b71.a.r;
        i = gVar.x;
        if (i != 0) {
        }
        bVar = (s5.b) obj2;
        if (bVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z5.k kVar, c71.c cVar) {
        h hVar;
        int i;
        s5.e Q;
        s5.b bVar;
        String str;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.x = i2 - Integer.MIN_VALUE;
                Object obj = hVar.v;
                b71.a aVar = b71.a.r;
                i = hVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    Q = b91.g.Q(c(kVar));
                    y71.i data = this.a.getData();
                    hVar.u = Q;
                    hVar.x = 1;
                    obj = n1Shadow.v(data, hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q = hVar.u;
                    sy.y.j(obj);
                }
                bVar = (s5.b) obj;
                if (bVar != null || (str = (String) bVar.d(Q)) == null || str.length() <= 0) {
                    return null;
                }
                return this.b.h(str);
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.v;
        b71.a aVar2 = b71.a.r;
        i = hVar.x;
        if (i != 0) {
        }
        bVar = (s5.b) obj2;
        return bVar != null ? null : null;
    }
}
