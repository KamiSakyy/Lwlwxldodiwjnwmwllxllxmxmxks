package com.github.rudroid.starredreposandlists.createoreditlist;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity$onCreate$2", f = "CreateNewListActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ CreateNewListActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CreateNewListActivity createNewListActivity, a71.c cVar) {
        super(2, cVar);
        this.w = createNewListActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        f fVar = new f(this.w, cVar);
        fVar.v = obj;
        return fVar;
    }

    public final Object s(Object obj, Object obj2) {
        f r = r((a71.c) obj2, (fl.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        fl.b bVar = (fl.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        CreateNewListActivity createNewListActivity = this.w;
        com.github.rudroid.activities.h0 c0 = createNewListActivity.c0(bVar);
        if (c0 != null) {
            createNewListActivity.r0(c0.a, 0);
        }
        return w61.a0.a;
    }
}
