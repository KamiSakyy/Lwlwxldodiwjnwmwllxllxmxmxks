package com.github.rudroid.repository.fork;

import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19735r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f19736s;

    public /* synthetic */ k(j jVar, int i) {
        this.f19735r = i;
        this.f19736s = jVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f19735r) {
            case k5.f.J:
                j jVar = this.f19736s;
                jVar.P(jVar.A, bVar, false);
                break;
            default:
                j jVar2 = this.f19736s;
                jVar2.P(jVar2.f19734z, bVar, false);
                break;
        }
        return a0.a;
    }
}
