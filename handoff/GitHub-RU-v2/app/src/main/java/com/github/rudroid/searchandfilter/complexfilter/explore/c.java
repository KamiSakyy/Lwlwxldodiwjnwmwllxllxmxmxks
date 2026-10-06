package com.github.rudroid.searchandfilter.complexfilter.explore;

import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.complexfilter.explore.SelectableLanguageBottomSheet;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ SelectableLanguageBottomSheet s;

    public /* synthetic */ c(SelectableLanguageBottomSheet selectableLanguageBottomSheet, int i) {
        this.r = i;
        this.s = selectableLanguageBottomSheet;
    }

    public final Object a() {
        int i = this.r;
        SelectableLanguageBottomSheet selectableLanguageBottomSheet = this.s;
        switch (i) {
            case 0:
                if (((Boolean) selectableLanguageBottomSheet.Z0.a(selectableLanguageBottomSheet, SelectableLanguageBottomSheet.d1[0])).booleanValue()) {
                    k71.e a = k71.x.a(com.github.rudroid.searchandfilter.q.class);
                    SelectableLanguageBottomSheet.b bVar = new SelectableLanguageBottomSheet.b(selectableLanguageBottomSheet);
                    SelectableLanguageBottomSheet.c cVar = new SelectableLanguageBottomSheet.c(selectableLanguageBottomSheet);
                    SelectableLanguageBottomSheet.d dVar = new SelectableLanguageBottomSheet.d(selectableLanguageBottomSheet);
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
                w61.h s = sy.w.s(w61.i.s, new SelectableLanguageBottomSheet.e(new c(selectableLanguageBottomSheet, 1)));
                k71.e a2 = k71.x.a(com.github.rudroid.searchandfilter.q.class);
                SelectableLanguageBottomSheet.f fVar = new SelectableLanguageBottomSheet.f(s);
                SelectableLanguageBottomSheet.g gVar = new SelectableLanguageBottomSheet.g(s);
                SelectableLanguageBottomSheet.h hVar = new SelectableLanguageBottomSheet.h(selectableLanguageBottomSheet, s);
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
            case 1:
                SelectableLanguageBottomSheet.a aVar = SelectableLanguageBottomSheet.Companion;
                return selectableLanguageBottomSheet.j4();
            default:
                selectableLanguageBottomSheet.s4();
                return w61.a0.a;
        }
    }
    public Object a(Object, Object) { return null; }
}
