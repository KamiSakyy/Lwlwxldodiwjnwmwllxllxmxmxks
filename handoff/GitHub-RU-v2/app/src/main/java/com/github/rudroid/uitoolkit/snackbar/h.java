package com.github.rudroid.uitoolkit.snackbar;

import w61.a0;
import y3.r;

/* loaded from: /home/user/work/p/classes3.dex */
final class h implements j71.c {
    public final /* synthetic */ y3.d r;
    public final /* synthetic */ y3.d s;
    public final /* synthetic */ y3.d t;
    public final /* synthetic */ String u;

    public h(y3.d dVar, y3.d dVar2, y3.d dVar3, String str) {
        this.r = dVar;
        this.s = dVar2;
        this.t = dVar3;
        this.u = str;
    }

    public final Object k(Object obj) {
        y3.c cVar = (y3.c) obj;
        k71.k.g(cVar, "$this$constrainAs");
        y3.e.c(cVar.e, this.r.f, 0.0f, 0.0f, 6);
        y3.e eVar = cVar.d;
        y3.g gVar = this.s.e;
        float f = ih.a.l;
        float f2 = ih.a.n;
        eVar.b(gVar, f, f2);
        y3.e.d(cVar.f, this.t.c, f2, 4);
        y3.e.c(cVar.g, cVar.c.f, 0.0f, 0.0f, 6);
        cVar.c(new y3.n((s3.f) null, "spread"));
        cVar.a(new y3.n((s3.f) null, "preferWrap"));
        cVar.b(this.u == null ? r.c : r.b);
        return a0.a;
    }
}
