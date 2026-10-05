package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationViewModel$updatePushSetting$1", f = "SettingsNotificationViewModel.kt", l = {169}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ i1 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ak.a y;
    public final /* synthetic */ com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(i1 i1Var, boolean z, ak.a aVar, com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar, a71.c cVar) {
        super(2, cVar);
        this.w = i1Var;
        this.x = z;
        this.y = aVar;
        this.z = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u1(this.w, this.x, this.y, this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            i1 i1Var = this.w;
            sm.g gVar = i1Var.v;
            oa.j d = i1Var.B.d();
            com.github.rudroid.repositories.repositoryownerrepositories.d dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(7, i1Var, this.z);
            this.v = 1;
            if (gVar.a(d, this.x, this.y, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
