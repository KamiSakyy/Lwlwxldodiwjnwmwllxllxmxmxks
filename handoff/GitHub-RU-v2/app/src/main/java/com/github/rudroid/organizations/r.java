package com.github.rudroid.organizations;

import java.util.ArrayList;
import java.util.List;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class r<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f17192r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f17193s;

    public r(t tVar, String str) {
        this.f17192r = tVar;
        this.f17193s = str;
    }

    public final Object c(Object obj, a71.c cVar) {
        fl.f c10;
        k01.a aVar = (k01.a) obj;
        ArrayList arrayList = aVar.a;
        x01.i iVar = aVar.b;
        t tVar = this.f17192r;
        tVar.f17203y = iVar;
        y1 y1Var = tVar.f17202x;
        if (this.f17193s == null) {
            fl.f.Companion.getClass();
            c10 = fl.e.c(arrayList);
        } else {
            fl.e eVar = fl.f.Companion;
            x61.r rVar = (List) ((fl.f) y1Var.getValue()).b;
            if (rVar == null) {
                rVar = x61.r.r;
            }
            ArrayList l02 = x61.m.l0(rVar, arrayList);
            eVar.getClass();
            c10 = fl.e.c(l02);
        }
        y1Var.getClass();
        y1Var.k((Object) null, c10);
        return a0.a;
    }
}
