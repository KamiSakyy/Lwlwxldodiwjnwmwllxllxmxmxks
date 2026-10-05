package com.github.rudroid.factories.actions;

import w61.a0;
import y71.j;
import y71.y;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements y71.i {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f12290r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f12291s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12292t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12293u;

    public c(y yVar, e eVar, String str, int i) {
        this.f12290r = yVar;
        this.f12291s = eVar;
        this.f12292t = str;
        this.f12293u = i;
    }

    public final Object b(j jVar, a71.c cVar) {
        Object b10 = this.f12290r.b(new b(jVar, this.f12291s, this.f12292t, this.f12293u), cVar);
        return b10 == b71.a.r ? b10 : a0.a;
    }
}
