package wf;

import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
import com.github.rudroid.searchandfilter.filter.sort.RepositoryFilterSortFragment;
import com.github.rudroid.searchandfilter.ui.e0;
import java.util.List;
import wf.h;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends g<v01.c> {
    public final List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RepositoryFilterSortFragment repositoryFilterSortFragment) {
        super(repositoryFilterSortFragment, RepositorySortFilter.x);
        RepositorySortFilter.Companion.getClass();
        v01.c cVar = v01.c.t;
        h.b bVar = new h.b(cVar, false, e0.b(cVar));
        v01.c cVar2 = v01.c.u;
        h.b bVar2 = new h.b(cVar2, true, e0.b(cVar2));
        v01.c cVar3 = v01.c.v;
        h.b bVar3 = new h.b(cVar3, false, e0.b(cVar3));
        v01.c cVar4 = v01.c.w;
        h.b bVar4 = new h.b(cVar4, true, e0.b(cVar4));
        v01.c cVar5 = v01.c.x;
        h.b bVar5 = new h.b(cVar5, false, e0.b(cVar5));
        v01.c cVar6 = v01.c.y;
        h.b bVar6 = new h.b(cVar6, true, e0.b(cVar6));
        v01.c cVar7 = v01.c.z;
        h.b bVar7 = new h.b(cVar7, false, e0.b(cVar7));
        v01.c cVar8 = v01.c.A;
        this.g = x61.l.r(new h.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new h.b(cVar8, false, e0.b(cVar8))});
        D(true);
    }

    @Override // wf.g
    public final List getData() {
        return this.g;
    }
}
