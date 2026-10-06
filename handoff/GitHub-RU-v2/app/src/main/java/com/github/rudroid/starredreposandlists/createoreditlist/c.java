package com.github.rudroid.starredreposandlists.createoreditlist;

import android.app.Application;
import com.github.rudroid.activities.p2;
import com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ CreateNewListActivity s;

    public /* synthetic */ c(CreateNewListActivity createNewListActivity, int i) {
        this.r = i;
        this.s = createNewListActivity;
    }

    public final Object a() {
        int i = this.r;
        p2 p2Var = this.s;
        switch (i) {
            case 0:
                CreateNewListActivity.a aVar = CreateNewListActivity.Companion;
                Application application = p2Var.getApplication();
                k71.k.f(application, "getApplication(...)");
                return new com.github.rudroid.utilities.b(application);
            default:
                CreateNewListActivity.a aVar2 = CreateNewListActivity.Companion;
                p2Var.m().c();
                return w61.a0.a;
        }
    }
    public Object v(Object p1) { return null; }
    public Object v(Object) { return null; }
}
