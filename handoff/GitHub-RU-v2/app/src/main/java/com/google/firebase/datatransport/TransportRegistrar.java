package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d8.m;
import i4.u;
import j11.f;
import java.util.Arrays;
import java.util.List;
import k11.a;
import m11.s;
import p41.b;
import p41.i;
import p41.o;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        s.b((Context) bVar.a(Context.class));
        return s.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p41.a> getComponents() {
        u a = p41.a.a(f.class);
        a.c = LIBRARY_NAME;
        a.a(i.a(Context.class));
        a.f = new m(15);
        p41.a b = a.b();
        u b2 = p41.a.b(new o(g51.a.class, f.class));
        b2.a(i.a(Context.class));
        b2.f = new m(16);
        p41.a b3 = b2.b();
        u b4 = p41.a.b(new o(g51.b.class, f.class));
        b4.a(i.a(Context.class));
        b4.f = new m(17);
        return Arrays.asList(b, b3, b4.b(), sy.o.c(LIBRARY_NAME, "19.0.0"));
    }

    public static  c(Object... a) {
        return null;
    }

    public static  b(Object... a) {
        return null;
    }

    public static  a(Object... a) {
        return null;
    }
}
