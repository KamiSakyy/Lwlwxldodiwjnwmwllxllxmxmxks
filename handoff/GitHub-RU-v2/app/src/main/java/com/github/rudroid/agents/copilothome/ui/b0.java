package com.github.rudroid.agents.copilothome.ui;

import com.github.rudroid.projects.ui.quickaction.h0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b0 implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6862r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.c f6863s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6864t;

    public /* synthetic */ b0(j71.c cVar, boolean z10, int i) {
        this.f6862r = i;
        this.f6863s = cVar;
        this.f6864t = z10;
    }

    public final Object a() {
        switch (this.f6862r) {
            case k5.f.J:
                this.f6863s.k(Boolean.valueOf(!this.f6864t));
                break;
            case 1:
                this.f6863s.k(new h0.d(this.f6864t));
                break;
            case 2:
                this.f6863s.k(new h0.k(this.f6864t));
                break;
            case 3:
                this.f6863s.k(Boolean.valueOf(!this.f6864t));
                break;
            case 4:
                this.f6863s.k(Boolean.valueOf(!this.f6864t));
                break;
            case 5:
                this.f6863s.k(Boolean.valueOf(!this.f6864t));
                break;
            default:
                this.f6863s.k(Boolean.valueOf(!this.f6864t));
                break;
        }
        return w61.a0.a;
    }
}
