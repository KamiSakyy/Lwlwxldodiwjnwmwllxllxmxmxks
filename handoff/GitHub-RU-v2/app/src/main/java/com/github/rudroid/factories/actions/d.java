package com.github.rudroid.factories.actions;

import c71.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import k71.k;
import sy.y;
import w61.a0;
import x61.m;

@c71.e(c = "com.github.rudroid.factories.actions.DefaultActionLogStorage$getLogFile$1", f = "DefaultActionLogStorage.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f12294v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f12295w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f12296x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f12297y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, int i, a71.c cVar) {
        super(2, cVar);
        this.f12295w = eVar;
        this.f12296x = str;
        this.f12297y = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        d dVar = new d(this.f12295w, this.f12296x, this.f12297y, cVar);
        dVar.f12294v = obj;
        return dVar;
    }

    public final Object s(Object obj, Object obj2) {
        d r10 = r((a71.c) obj2, (File) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        File file = (File) this.f12294v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        k.g(file, "<this>");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                k.d(file2);
                if (!k.b(file2.getName(), e.a(this.f12295w, this.f12296x, this.f12297y))) {
                    arrayList.add(file2);
                }
            }
            Iterator it = m.x0(m.v0(arrayList, new f()), Math.max(r10.size() - 10, 0)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        return a0.a;
    }
}
