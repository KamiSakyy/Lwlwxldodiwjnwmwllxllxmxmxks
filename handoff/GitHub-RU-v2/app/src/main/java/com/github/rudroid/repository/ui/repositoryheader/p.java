package com.github.rudroid.repository.ui.repositoryheader;

import com.github.rudroid.repository.f3;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class p implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20269r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.e f20270s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f3.c f20271t;

    public /* synthetic */ p(j71.e eVar, f3.c cVar, int i) {
        this.f20269r = i;
        this.f20270s = eVar;
        this.f20271t = cVar;
    }

    public final Object a() {
        switch (this.f20269r) {
            case k5.f.J:
                this.f20270s.s(Boolean.TRUE, this.f20271t.f19313s.u);
                break;
            case 1:
                this.f20270s.s(Boolean.FALSE, this.f20271t.f19313s.u);
                break;
            default:
                p01.e eVar = this.f20271t.f19313s.H;
                String str = eVar != null ? eVar.a : null;
                if (str == null) {
                    str = "";
                }
                String str2 = eVar != null ? eVar.b : null;
                this.f20270s.s(str, str2 != null ? str2 : "");
                break;
        }
        return w61.a0.a;
    }
}
