package com.github.rudroid.starredreposandlists.createoreditlist;

import androidx.compose.runtime.i3;
import androidx.lifecycle.l1;
import com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ d(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj3 = this.s;
        int i2 = 1;
        switch (i) {
            case 0:
                CreateNewListActivity createNewListActivity = (CreateNewListActivity) obj3;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                CreateNewListActivity.a aVar = CreateNewListActivity.Companion;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1306749134, new g0(createNewListActivity, (f1) androidx.compose.runtime.t.m(createNewListActivity.J0().x, f1.t, (a71.h) null, sVar, 48, 2).getValue()), sVar), sVar, 805306368, 511);
                    break;
                }
            default:
                EditListFragment editListFragment = (EditListFragment) obj3;
                l1 l1Var = editListFragment.E0;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    y71.i1 i1Var = ((u0) l1Var.getValue()).x;
                    fl.f.Companion.getClass();
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1320717136, new f0((i3) k41.b.k(i1Var, fl.e.b(null), sVar2, 0), editListFragment, (f1) k41.b.k(((u0) l1Var.getValue()).z, f1.r, sVar2, 48).getValue(), i2), sVar2), sVar2, 805306368, 511);
                    break;
                }
        }
        return a0Var;
    }





}
