package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i4.u;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k41.g;
import m11.r;
import n51.e;
import n51.f;
import o41.a;
import p41.b;
import p41.i;
import p41.o;
import q41.j;
import q51.c;
import q51.d;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((g) bVar.a(g.class), bVar.e(f.class), (ExecutorService) bVar.b(new o(a.class, ExecutorService.class)), new j((Executor) bVar.b(new o(o41.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p41.a> getComponents() {
        u a = p41.a.a(d.class);
        a.c = LIBRARY_NAME;
        a.a(i.a(g.class));
        a.a(new i(0, 1, f.class));
        a.a(new i(new o(a.class, ExecutorService.class), 1, 0));
        a.a(new i(new o(o41.b.class, Executor.class), 1, 0));
        a.f = new r(10);
        p41.a b = a.b();
        e eVar = new e(0);
        u a2 = p41.a.a(e.class);
        a2.b = 1;
        a2.f = new c5.b(17, eVar);
        return Arrays.asList(b, a2.b(), sy.oShadow.c(LIBRARY_NAME, "18.0.0"));
    }
}
