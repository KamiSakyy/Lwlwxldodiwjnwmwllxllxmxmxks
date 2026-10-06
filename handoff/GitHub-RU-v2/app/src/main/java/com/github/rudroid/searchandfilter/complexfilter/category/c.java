package com.github.rudroid.searchandfilter.complexfilter.category;

import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.complexfilter.category.SelectableDiscussionCategoryBottomSheet;
import k71.xShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ SelectableDiscussionCategoryBottomSheet s;

    public /* synthetic */ c(SelectableDiscussionCategoryBottomSheet selectableDiscussionCategoryBottomSheet, int i) {
        this.r = i;
        this.s = selectableDiscussionCategoryBottomSheet;
    }

    public final Object a() {
        int i = this.r;
        SelectableDiscussionCategoryBottomSheet selectableDiscussionCategoryBottomSheet = this.s;
        switch (i) {
            case 0:
                if (((Boolean) selectableDiscussionCategoryBottomSheet.Z0.a(selectableDiscussionCategoryBottomSheet, SelectableDiscussionCategoryBottomSheet.d1[0])).booleanValue()) {
                    k71.e a = xShadow.a(com.github.rudroid.searchandfilter.q.class);
                    SelectableDiscussionCategoryBottomSheet.b bVar = new SelectableDiscussionCategoryBottomSheet.b(selectableDiscussionCategoryBottomSheet);
                    SelectableDiscussionCategoryBottomSheet.c cVar = new SelectableDiscussionCategoryBottomSheet.c(selectableDiscussionCategoryBottomSheet);
                    SelectableDiscussionCategoryBottomSheet.d dVar = new SelectableDiscussionCategoryBottomSheet.d(selectableDiscussionCategoryBottomSheet);
                    t1 t1Var = (t1) bVar.a();
                    o1 o1Var = (o1) dVar.a();
                    t6.c cVar2 = (t6.c) cVar.a();
                    k71.k.g(t1Var, "store");
                    k71.k.g(o1Var, "factory");
                    k71.k.g(cVar2, "extras");
                    w51.r rVar = new w51.r(t1Var, o1Var, cVar2);
                    String b = a.b();
                    if (b != null) {
                        return (com.github.rudroid.searchandfilter.q) rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                w61.h s = sy.w.s(w61.i.s, new SelectableDiscussionCategoryBottomSheet.e(new c(selectableDiscussionCategoryBottomSheet, 1)));
                k71.e a2 = xShadow.a(com.github.rudroid.searchandfilter.q.class);
                SelectableDiscussionCategoryBottomSheet.f fVar = new SelectableDiscussionCategoryBottomSheet.f(s);
                SelectableDiscussionCategoryBottomSheet.g gVar = new SelectableDiscussionCategoryBottomSheet.g(s);
                SelectableDiscussionCategoryBottomSheet.h hVar = new SelectableDiscussionCategoryBottomSheet.h(selectableDiscussionCategoryBottomSheet, s);
                t1 t1Var2 = (t1) fVar.a();
                o1 o1Var2 = (o1) hVar.a();
                t6.c cVar3 = (t6.c) gVar.a();
                k71.k.g(t1Var2, "store");
                k71.k.g(o1Var2, "factory");
                k71.k.g(cVar3, "extras");
                w51.r rVar2 = new w51.r(t1Var2, o1Var2, cVar3);
                String b2 = a2.b();
                if (b2 != null) {
                    return (com.github.rudroid.searchandfilter.q) rVar2.E(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            default:
                SelectableDiscussionCategoryBottomSheet.a aVar = SelectableDiscussionCategoryBottomSheet.Companion;
                return selectableDiscussionCategoryBottomSheet.j4();
        }
    }

    public Object a(Object p1, Object p2) { return null; }
}
