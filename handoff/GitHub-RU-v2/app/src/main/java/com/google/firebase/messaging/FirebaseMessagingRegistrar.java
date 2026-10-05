package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i4.u;
import j11.f;
import java.util.Arrays;
import java.util.List;
import k41.g;
import m51.c;
import o51.a;
import p41.b;
import p41.i;
import p41.o;
import q51.d;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(o oVar, b bVar) {
        g gVar = (g) bVar.a(g.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, bVar.e(y51.b.class), bVar.e(n51.g.class), (d) bVar.a(d.class), bVar.d(oVar), (c) bVar.a(c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p41.a> getComponents() {
        o oVar = new o(g51.b.class, f.class);
        u a = p41.a.a(FirebaseMessaging.class);
        a.c = LIBRARY_NAME;
        a.a(i.a(g.class));
        a.a(new i(0, 0, a.class));
        a.a(new i(0, 1, y51.b.class));
        a.a(new i(0, 1, n51.g.class));
        a.a(i.a(d.class));
        a.a(new i(oVar, 0, 1));
        a.a(i.a(c.class));
        a.f = new n51.b(oVar, 1);
        a.i(1);
        return Arrays.asList(a.b(), sy.o.c(LIBRARY_NAME, "24.1.2"));
    }
}
