package com.github.rudroid.starredreposandlists.createoreditlist;

import androidx.compose.foundation.layout.p2;
import com.github.rudroid.starredreposandlists.createoreditlist.CreateNewListActivity;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g0 implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ f1 s;
    public final /* synthetic */ Object t;

    public /* synthetic */ g0(CreateNewListActivity createNewListActivity, f1 f1Var) {
        this.r = 2;
        this.t = createNewListActivity;
        this.s = f1Var;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        f1 f1Var = this.s;
        d2.l0 l0Var = d2.a0Shadow.b;
        w1.o oVar = w1.o.a;
        Object obj3 = androidx.compose.runtime.n.a;
        w61.a0 a0Var = w61.a0.a;
        Object obj4 = this.t;
        int i2 = 1;
        switch (i) {
            case 0:
                EditListFragment editListFragment = (EditListFragment) obj4;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    com.github.rudroid.uitoolkit.utils.z.a(f0.o.f(p2.d(oVar, 1.0f), ih.d.b(sVar).b, l0Var), r1.i.d(-1946419114, new g0(f1Var, editListFragment, i2), sVar), null, null, null, 0, ih.d.b(sVar).d, 0L, b.a, sVar, 100663344, 188);
                    break;
                }
            case 1:
                EditListFragment editListFragment2 = (EditListFragment) obj4;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    boolean h = sVar2.h(editListFragment2);
                    Object N = sVar2.N();
                    if (h || N == obj3) {
                        N = new e0(editListFragment2, 2);
                        sVar2.n0(N);
                    }
                    j71.a aVar = (j71.a) N;
                    Object N2 = sVar2.N();
                    if (N2 == obj3) {
                        N2 = new com.github.rudroid.widget.p(15);
                        sVar2.n0(N2);
                    }
                    c0.d(f1Var, aVar, (j71.a) N2, sVar2, 384);
                    break;
                }
            default:
                CreateNewListActivity createNewListActivity = (CreateNewListActivity) obj4;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                CreateNewListActivity.a aVar2 = CreateNewListActivity.Companion;
                if (!sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    w1.r f = f0.o.f(p2.d(com.github.rudroid.utilities.c0.a(ih.d.b(sVar3).b, oVar), 1.0f), ih.d.b(sVar3).d, l0Var);
                    r J0 = createNewListActivity.J0();
                    boolean h2 = sVar3.h(J0);
                    Object N3 = sVar3.N();
                    if (h2 || N3 == obj3) {
                        g gVar = new g(2, J0, r.class, "saveList", "saveList(Ljava/lang/String;Ljava/lang/String;)V", 0, 0);
                        sVar3.n0(gVar);
                        N3 = gVar;
                    }
                    j71.e eVar = (k71.i) N3;
                    r J02 = createNewListActivity.J0();
                    boolean h3 = sVar3.h(J02);
                    Object N4 = sVar3.N();
                    if (h3 || N4 == obj3) {
                        h hVar = new h(1, J02, r.class, "onTitleChange", "onTitleChange(Ljava/lang/String;)V", 0, 0);
                        sVar3.n0(hVar);
                        N4 = hVar;
                    }
                    j71.c cVar = (k71.i) N4;
                    j71.e eVar2 = eVar;
                    boolean h4 = sVar3.h(createNewListActivity);
                    Object N5 = sVar3.N();
                    if (h4 || N5 == obj3) {
                        N5 = new c(createNewListActivity, 1);
                        sVar3.n0(N5);
                    }
                    c0.a(f, eVar2, (j71.a) N5, cVar, this.s, sVar3, 1769472);
                    break;
                }
        }
        return a0Var;
    }

    public /* synthetic */ g0(f1 f1Var, EditListFragment editListFragment, int i) {
        this.r = i;
        this.s = f1Var;
        this.t = editListFragment;
    }
}
