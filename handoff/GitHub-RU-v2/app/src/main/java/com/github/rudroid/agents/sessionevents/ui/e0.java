package com.github.rudroid.agents.sessionevents.ui;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 implements com.github.rudroid.interfaces.r {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j71.c f7920r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.c f7921s;

    public e0(j71.c cVar, j71.c cVar2) {
        this.f7920r = cVar;
        this.f7921s = cVar2;
    }

    @Override // com.github.rudroid.interfaces.r
    public final void d0(String str) {
        k71.k.g(str, "repoUrl");
    }

    @Override // com.github.rudroid.interfaces.r
    public final void o1(String str, String str2, boolean z10) {
        k71.k.g(str, "path");
        this.f7921s.k(str);
    }

    @Override // com.github.rudroid.interfaces.r
    public final void x2(String str) {
        k71.k.g(str, "path");
        this.f7920r.k(str);
    }

    @Override // com.github.rudroid.interfaces.r
    public final void y2(String str) {
        k71.k.g(str, "path");
    }
}
