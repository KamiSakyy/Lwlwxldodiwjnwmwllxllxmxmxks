package com.github.rudroid.settings.applock;

import yf.f;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w extends t.q {
    public final /* synthetic */ x71.w a;

    public w(x71.w wVar) {
        this.a = wVar;
    }

    public final void n(int i, CharSequence charSequence) {
        k71.k.g(charSequence, "errString");
        f.a aVar = new f.a(charSequence.toString(), i);
        x71.w wVar = this.a;
        t.q.t(wVar, aVar);
        wVar.e((Throwable) null);
    }

    public final void o(t.r rVar) {
        k71.k.g(rVar, "result");
        f.b bVar = f.b.a;
        x71.w wVar = this.a;
        t.q.t(wVar, bVar);
        wVar.e((Throwable) null);
    }
}
