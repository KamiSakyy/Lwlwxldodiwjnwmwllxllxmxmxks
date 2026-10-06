package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c21.uShadow;
import com.google.android.gms.internal.measurement.k1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k.m;
import k41.g;
import m41.a;
import m51.c;
import p41.b;
import p41.i;
import p41.j;
import sy.oShadow;
import z70.j3;
import z70.y1;

@Keep
/* loaded from: /home/user/work/p/classes4.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(b bVar) {
        g gVar = (g) bVar.a(g.class);
        Context context = (Context) bVar.a(Context.class);
        c cVar = (c) bVar.a(c.class);
        uShadow.g(gVar);
        uShadow.g(context);
        uShadow.g(cVar);
        uShadow.g(context.getApplicationContext());
        if (m41.b.c == null) {
            synchronized (m41.b.class) {
                try {
                    if (m41.b.c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.b)) {
                            ((j) cVar).a(m.s, y1.w);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.g());
                        }
                        m41.b.c = new m41.b(k1.c(context, bundle).b);
                    }
                } finally {
                }
            }
        }
        return m41.b.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<p41.a> getComponents() {
        i4.uShadow a = p41.a.a(a.class);
        a.a(i.a(g.class));
        a.a(i.a(Context.class));
        a.a(i.a(c.class));
        a.f = j3.w;
        a.i(2);
        return Arrays.asList(a.b(), oShadow.c("fire-analytics", "23.0.0"));
    }

    public static Object zza(Object... a) {
        return null;
    }
}
