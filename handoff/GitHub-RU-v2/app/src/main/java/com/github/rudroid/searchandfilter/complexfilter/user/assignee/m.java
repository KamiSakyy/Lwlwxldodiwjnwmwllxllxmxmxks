package com.github.rudroid.searchandfilter.complexfilter.user.assignee;

import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.complexfilter.user.assignee.RepositoryAssigneesBottomSheet;
import com.github.rudroid.searchandfilter.q;
import k71.xShadow;
import sy.w;
import w51.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ RepositoryAssigneesBottomSheet s;

    public /* synthetic */ m(RepositoryAssigneesBottomSheet repositoryAssigneesBottomSheet, int i) {
        this.r = i;
        this.s = repositoryAssigneesBottomSheet;
    }

    public final Object a() {
        int i = this.r;
        RepositoryAssigneesBottomSheet repositoryAssigneesBottomSheet = this.s;
        switch (i) {
            case 0:
                if (((Boolean) repositoryAssigneesBottomSheet.Y0.a(repositoryAssigneesBottomSheet, RepositoryAssigneesBottomSheet.d1[0])).booleanValue()) {
                    k71.e a = xShadow.a(q.class);
                    RepositoryAssigneesBottomSheet.b bVar = new RepositoryAssigneesBottomSheet.b(repositoryAssigneesBottomSheet);
                    RepositoryAssigneesBottomSheet.c cVar = new RepositoryAssigneesBottomSheet.c(repositoryAssigneesBottomSheet);
                    RepositoryAssigneesBottomSheet.d dVar = new RepositoryAssigneesBottomSheet.d(repositoryAssigneesBottomSheet);
                    t1 t1Var = (t1) bVar.a();
                    o1 o1Var = (o1) dVar.a();
                    t6.c cVar2 = (t6.c) cVar.a();
                    k71.k.g(t1Var, "store");
                    k71.k.g(o1Var, "factory");
                    k71.k.g(cVar2, "extras");
                    r rVar = new r(t1Var, o1Var, cVar2);
                    String b = a.b();
                    if (b != null) {
                        return (q) rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                w61.h s = w.s(w61.i.s, new RepositoryAssigneesBottomSheet.e(new m(repositoryAssigneesBottomSheet, 1)));
                k71.e a2 = xShadow.a(q.class);
                RepositoryAssigneesBottomSheet.f fVar = new RepositoryAssigneesBottomSheet.f(s);
                RepositoryAssigneesBottomSheet.g gVar = new RepositoryAssigneesBottomSheet.g(s);
                RepositoryAssigneesBottomSheet.h hVar = new RepositoryAssigneesBottomSheet.h(repositoryAssigneesBottomSheet, s);
                t1 t1Var2 = (t1) fVar.a();
                o1 o1Var2 = (o1) hVar.a();
                t6.c cVar3 = (t6.c) gVar.a();
                k71.k.g(t1Var2, "store");
                k71.k.g(o1Var2, "factory");
                k71.k.g(cVar3, "extras");
                r rVar2 = new r(t1Var2, o1Var2, cVar3);
                String b2 = a2.b();
                if (b2 != null) {
                    return (q) rVar2.E(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            default:
                RepositoryAssigneesBottomSheet.a aVar = RepositoryAssigneesBottomSheet.Companion;
                return repositoryAssigneesBottomSheet.j4();
        }
    }
}
