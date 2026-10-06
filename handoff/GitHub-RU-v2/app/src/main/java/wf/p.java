package wf;

import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.filter.sort.RepositoryFilterSortBottomSheetDialog;
import k71.xShadow;
import sy.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ RepositoryFilterSortBottomSheetDialog s;

    public /* synthetic */ p(RepositoryFilterSortBottomSheetDialog repositoryFilterSortBottomSheetDialog, int i) {
        this.r = i;
        this.s = repositoryFilterSortBottomSheetDialog;
    }

    public final Object a() {
        int i = this.r;
        RepositoryFilterSortBottomSheetDialog repositoryFilterSortBottomSheetDialog = this.s;
        switch (i) {
            case 0:
                int i2 = 1;
                if (((Boolean) repositoryFilterSortBottomSheetDialog.W0.a(repositoryFilterSortBottomSheetDialog, RepositoryFilterSortBottomSheetDialog.Y0[1])).booleanValue()) {
                    k71.e a = xShadow.a(com.github.rudroid.searchandfilter.q.class);
                    RepositoryFilterSortBottomSheetDialog.b bVar = new RepositoryFilterSortBottomSheetDialog.b(repositoryFilterSortBottomSheetDialog);
                    RepositoryFilterSortBottomSheetDialog.c cVar = new RepositoryFilterSortBottomSheetDialog.c(repositoryFilterSortBottomSheetDialog);
                    RepositoryFilterSortBottomSheetDialog.d dVar = new RepositoryFilterSortBottomSheetDialog.d(repositoryFilterSortBottomSheetDialog);
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
                w61.h s = w.s(w61.i.s, new RepositoryFilterSortBottomSheetDialog.e(new p(repositoryFilterSortBottomSheetDialog, i2)));
                k71.e a2 = xShadow.a(com.github.rudroid.searchandfilter.q.class);
                RepositoryFilterSortBottomSheetDialog.f fVar = new RepositoryFilterSortBottomSheetDialog.f(s);
                RepositoryFilterSortBottomSheetDialog.g gVar = new RepositoryFilterSortBottomSheetDialog.g(s);
                RepositoryFilterSortBottomSheetDialog.h hVar = new RepositoryFilterSortBottomSheetDialog.h(repositoryFilterSortBottomSheetDialog, s);
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
                RepositoryFilterSortBottomSheetDialog.a aVar = RepositoryFilterSortBottomSheetDialog.Companion;
                return repositoryFilterSortBottomSheetDialog.j4();
        }
    }
}
