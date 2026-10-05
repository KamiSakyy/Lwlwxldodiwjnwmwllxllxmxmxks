package com.github.rudroid.copilot;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class d0 implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9521r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.f1 f9522s;

    public /* synthetic */ d0(androidx.compose.runtime.f1 f1Var, int i) {
        this.f9521r = i;
        this.f9522s = f1Var;
    }

    public final Object a() {
        switch (this.f9521r) {
            case k5.f.J /* 0 */:
                this.f9522s.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f9522s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 2:
                this.f9522s.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f9522s.setValue(Boolean.FALSE);
                break;
            default:
                this.f9522s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
        }
        return w61.a0.a;
    }
}
