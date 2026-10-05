package com.github.rudroid.starredreposandlists.createoreditlist;

import android.content.Intent;
import com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity$onCreate$1", f = "CreateNewListActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ CreateNewListActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreateNewListActivity createNewListActivity, a71.c cVar) {
        super(2, cVar);
        this.w = createNewListActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        e eVar = new e(this.w, cVar);
        eVar.v = obj;
        return eVar;
    }

    public final Object s(Object obj, Object obj2) {
        e r = r((a71.c) obj2, (f1) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        f1 f1Var = (f1) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (f1Var == f1.v) {
            CreateNewListActivity.a aVar2 = CreateNewListActivity.Companion;
            d.j jVar = this.w;
            if (!((Boolean) jVar.J0().z.getValue()).booleanValue()) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_REFRESH_NEEDED", true);
                jVar.setResult(-1, intent);
            }
            jVar.m().c();
        }
        return w61.a0.a;
    }
}
