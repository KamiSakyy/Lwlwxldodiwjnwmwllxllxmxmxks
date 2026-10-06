package com.google.firebase.sessions;

import a61.i;
import a61.m;
import a61.p;
import a61.p0;
import a61.s;
import a61.t;
import a61.w;
import a61.x;
import a61.x0;
import a71.h;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d61.c;
import i4.u;
import j11.f;
import java.util.List;
import k41.g;
import k71.k;
import o41.a;
import o41.b;
import p41.o;
import q51.d;
import v71.v;
import x61.l;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final w Companion = new w();
    private static final o appContext = o.a(Context.class);
    private static final o firebaseApp = o.a(g.class);
    private static final o firebaseInstallationsApi = o.a(d.class);
    private static final o backgroundDispatcher = new o(a.class, v.class);
    private static final o blockingDispatcher = new o(b.class, v.class);
    private static final o transportFactory = o.a(f.class);
    private static final o firebaseSessionsComponent = o.a(s.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final p getComponents$lambda$0(p41.b bVar) {
        return (p) ((i) ((s) bVar.b(firebaseSessionsComponent))).i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s getComponents$lambda$1(p41.b bVar) {
        Object b = bVar.b(appContext);
        k.f(b, "container[appContext]");
        Object b2 = bVar.b(backgroundDispatcher);
        k.f(b2, "container[backgroundDispatcher]");
        Object b3 = bVar.b(blockingDispatcher);
        k.f(b3, "container[blockingDispatcher]");
        Object b4 = bVar.b(firebaseApp);
        k.f(b4, "container[firebaseApp]");
        Object b5 = bVar.b(firebaseInstallationsApi);
        k.f(b5, "container[firebaseInstallationsApi]");
        p51.b d = bVar.d(transportFactory);
        k.f(d, "container.getProvider(transportFactory)");
        i iVar = new i();
        iVar.a = c.a((g) b4);
        c a = c.a((Context) b);
        iVar.b = a;
        iVar.c = d61.a.a(new m(a, 5));
        iVar.d = c.a((h) b2);
        iVar.e = c.a((d) b5);
        v61.a a2 = d61.a.a(new m(iVar.a, 1));
        iVar.f = a2;
        iVar.g = d61.a.a(new p0(a2, iVar.d, 2));
        iVar.h = d61.a.a(new p0(iVar.c, d61.a.a(new x0((v61.a) iVar.d, (v61.a) iVar.e, iVar.f, iVar.g, d61.a.a(new m(d61.a.a(new m(iVar.b, 2)), 6)))), 3));
        iVar.i = d61.a.a(new x(iVar.a, iVar.h, iVar.d, d61.a.a(new m(iVar.b, 4))));
        iVar.j = d61.a.a(new p0(iVar.d, d61.a.a(new m(iVar.b, 3)), 0));
        iVar.k = d61.a.a(new x0(iVar.a, (v61.a) iVar.e, iVar.h, d61.a.a(new m(c.a(d), 0)), (v61.a) iVar.d));
        iVar.l = d61.a.a(t.a);
        iVar.m = d61.a.a(new p0(iVar.l, d61.a.a(t.b), 1));
        return iVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p41.a> getComponents() {
        u a = p41.a.a(p.class);
        a.c = LIBRARY_NAME;
        a.a(p41.i.b(firebaseSessionsComponent));
        a.f = new a5.i(6);
        a.i(2);
        p41.a b = a.b();
        u a2 = p41.a.a(s.class);
        a2.c = "fire-sessions-component";
        a2.a(p41.i.b(appContext));
        a2.a(p41.i.b(backgroundDispatcher));
        a2.a(p41.i.b(blockingDispatcher));
        a2.a(p41.i.b(firebaseApp));
        a2.a(p41.i.b(firebaseInstallationsApi));
        a2.a(new p41.i(transportFactory, 1, 1));
        a2.f = new a5.i(7);
        return l.r(new p41.a[]{b, a2.b(), sy.o.c(LIBRARY_NAME, "2.1.2")});
    }

    public static Object b(Object... a) {
        return null;
    }

    public static Object a(Object... a) {
        return null;
    }
}
