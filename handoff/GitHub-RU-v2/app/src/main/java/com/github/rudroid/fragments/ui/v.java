package com.github.rudroid.fragments.ui;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class v implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.viewmodels.search.c f14712s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.f1 f14713t;

    public /* synthetic */ v(com.github.rudroid.viewmodels.search.c cVar, androidx.compose.runtime.f1 f1Var, int i) {
        this.f14711r = i;
        this.f14712s = cVar;
        this.f14713t = f1Var;
    }

    public final Object a() {
        switch (this.f14711r) {
            case k5.f.J /* 0 */:
                this.f14712s.R((String) this.f14713t.getValue());
                break;
            default:
                this.f14713t.setValue(Boolean.FALSE);
                this.f14712s.P();
                break;
        }
        return w61.a0.a;
    }
}
