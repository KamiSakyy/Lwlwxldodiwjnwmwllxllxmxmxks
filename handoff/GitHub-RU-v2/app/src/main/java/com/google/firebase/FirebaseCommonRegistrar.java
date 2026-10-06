package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import d8.m;
import i4.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m11.r;
import n51.d;
import n51.e;
import n51.f;
import n51.g;
import p41.a;
import p41.i;
import p41.o;
import y51.b;

/* loaded from: /home/user/work/p/classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        u a = a.a(b.class);
        a.a(new i(2, 0, y51.a.class));
        a.f = new r(25);
        arrayList.add(a.b());
        o oVar = new o(o41.a.class, Executor.class);
        u uVar = new u(d.class, new Class[]{f.class, g.class});
        uVar.a(i.a(Context.class));
        uVar.a(i.a(k41.g.class));
        uVar.a(new i(2, 0, e.class));
        uVar.a(new i(1, 1, b.class));
        uVar.a(new i(oVar, 1, 0));
        uVar.f = new n51.b(oVar, 0);
        arrayList.add(uVar.b());
        arrayList.add(sy.oShadow.c("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(sy.oShadow.c("fire-core", "21.0.0"));
        arrayList.add(sy.oShadow.c("device-name", a(Build.PRODUCT)));
        arrayList.add(sy.oShadow.c("device-model", a(Build.DEVICE)));
        arrayList.add(sy.oShadow.c("device-brand", a(Build.BRAND)));
        arrayList.add(sy.oShadow.h("android-target-sdk", new m(22)));
        arrayList.add(sy.oShadow.h("android-min-sdk", new m(23)));
        arrayList.add(sy.oShadow.h("android-platform", new m(24)));
        arrayList.add(sy.oShadow.h("android-installer", new m(25)));
        try {
            w61.g.s.getClass();
            str = "2.2.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(sy.oShadow.c("kotlin", str));
        }
        return arrayList;
    }
}
