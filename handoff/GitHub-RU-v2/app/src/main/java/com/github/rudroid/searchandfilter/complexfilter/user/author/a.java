package com.github.rudroid.searchandfilter.complexfilter.user.author;

import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.complexfilter.user.author.RepositoryAuthorBottomSheet;
import com.github.rudroid.searchandfilter.q;
import k71.e;
import k71.k;
import k71.x;
import sy.w;
import w51.r;
import w61.h;
import w61.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ RepositoryAuthorBottomSheet s;

    public /* synthetic */ a(RepositoryAuthorBottomSheet repositoryAuthorBottomSheet, int i) {
        this.r = i;
        this.s = repositoryAuthorBottomSheet;
    }

    public final Object a() {
        int i = this.r;
        RepositoryAuthorBottomSheet repositoryAuthorBottomSheet = this.s;
        switch (i) {
            case 0:
                if (((Boolean) repositoryAuthorBottomSheet.Z0.a(repositoryAuthorBottomSheet, RepositoryAuthorBottomSheet.d1[0])).booleanValue()) {
                    e a = x.a(q.class);
                    RepositoryAuthorBottomSheet.b bVar = new RepositoryAuthorBottomSheet.b(repositoryAuthorBottomSheet);
                    RepositoryAuthorBottomSheet.c cVar = new RepositoryAuthorBottomSheet.c(repositoryAuthorBottomSheet);
                    RepositoryAuthorBottomSheet.d dVar = new RepositoryAuthorBottomSheet.d(repositoryAuthorBottomSheet);
                    t1 t1Var = (t1) bVar.a();
                    o1 o1Var = (o1) dVar.a();
                    t6.c cVar2 = (t6.c) cVar.a();
                    k.g(t1Var, "store");
                    k.g(o1Var, "factory");
                    k.g(cVar2, "extras");
                    r rVar = new r(t1Var, o1Var, cVar2);
                    String b = a.b();
                    if (b != null) {
                        return (q) rVar.E(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    }
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                h s = w.s(i.s, new RepositoryAuthorBottomSheet.e(new a(repositoryAuthorBottomSheet, 1)));
                e a2 = x.a(q.class);
                RepositoryAuthorBottomSheet.f fVar = new RepositoryAuthorBottomSheet.f(s);
                RepositoryAuthorBottomSheet.g gVar = new RepositoryAuthorBottomSheet.g(s);
                RepositoryAuthorBottomSheet.h hVar = new RepositoryAuthorBottomSheet.h(repositoryAuthorBottomSheet, s);
                t1 t1Var2 = (t1) fVar.a();
                o1 o1Var2 = (o1) hVar.a();
                t6.c cVar3 = (t6.c) gVar.a();
                k.g(t1Var2, "store");
                k.g(o1Var2, "factory");
                k.g(cVar3, "extras");
                r rVar2 = new r(t1Var2, o1Var2, cVar3);
                String b2 = a2.b();
                if (b2 != null) {
                    return (q) rVar2.E(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            default:
                RepositoryAuthorBottomSheet.a aVar = RepositoryAuthorBottomSheet.Companion;
                return repositoryAuthorBottomSheet.j4();
        }
    }
}
