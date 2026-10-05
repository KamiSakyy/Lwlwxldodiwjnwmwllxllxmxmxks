package com.github.rudroid.actions.workflowsummary.ui;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class g0 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.a f5655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.a f5656t;

    public /* synthetic */ g0(j71.a aVar, j71.a aVar2, int i) {
        this.f5654r = i;
        this.f5655s = aVar;
        this.f5656t = aVar2;
    }

    public final Object k(Object obj) {
        switch (this.f5654r) {
            case k5.f.J /* 0 */:
                String str = (String) obj;
                k71.k.g(str, "menuId");
                if (str.equals("overflow_menu_refresh_id")) {
                    this.f5655s.a();
                } else if (str.equals("overflow_menu_create_agent_session_id")) {
                    this.f5656t.a();
                }
                break;
            case 1:
                v0.g gVar = (v0.g) obj;
                this.f5655s.a();
                j71.a aVar = this.f5656t;
                if (aVar != null ? ((Boolean) aVar.a()).booleanValue() : true) {
                    gVar.close();
                }
                break;
            default:
                v0.g gVar2 = (v0.g) obj;
                this.f5655s.a();
                j71.a aVar2 = this.f5656t;
                if (aVar2 != null ? ((Boolean) aVar2.a()).booleanValue() : true) {
                    gVar2.close();
                }
                break;
        }
        return w61.a0.a;
    }
}
