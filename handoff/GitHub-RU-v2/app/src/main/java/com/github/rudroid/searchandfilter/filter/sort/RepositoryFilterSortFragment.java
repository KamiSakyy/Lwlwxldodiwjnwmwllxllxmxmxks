package com.github.rudroid.searchandfilter.filter.sort;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a0;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
import com.github.rudroid.searchandfilter.q;
import com.github.service.models.response.type.MobileSubjectType;
import ic.y2;
import k71.k;
import sy.w;
import v01.c;
import w61.p;
import wf.n;
import wf.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryFilterSortFragment extends Hilt_RepositoryFilterSortFragment<y2> implements s<c> {
    public static final a Companion = new a();
    public final int E0 = 2131558797;
    public final p F0 = w.t(new w8.p(2, this));

    public static final class a {
    }

    public final int C4() {
        return this.E0;
    }

    public final void c4(View view, Bundle bundle) {
        k.g(view, "view");
        n nVar = new n(this);
        B4().N.setAdapter(nVar);
        nVar.f = (c) this.F0.getValue();
        nVar.n();
    }

    @Override // wf.s
    public final void m0(Object obj) {
        c cVar = (c) obj;
        k.g(cVar, "filter");
        RepositoryFilterSortBottomSheetDialog repositoryFilterSortBottomSheetDialog = ((a0) this).P;
        RepositoryFilterSortBottomSheetDialog repositoryFilterSortBottomSheetDialog2 = repositoryFilterSortBottomSheetDialog instanceof RepositoryFilterSortBottomSheetDialog ? repositoryFilterSortBottomSheetDialog : null;
        if (repositoryFilterSortBottomSheetDialog2 != null) {
            p pVar = repositoryFilterSortBottomSheetDialog2.X0;
            if (cVar == ((c) this.F0.getValue())) {
                ((q) pVar.getValue()).Y(new RepositorySortFilter(), MobileSubjectType.FILTER_SORT);
                repositoryFilterSortBottomSheetDialog2.s4();
            } else {
                ((q) pVar.getValue()).Y(new RepositorySortFilter(cVar), MobileSubjectType.FILTER_SORT);
                repositoryFilterSortBottomSheetDialog2.s4();
            }
        }
    }

    public static  n4(Object... a) {
        return null;
    }

    public static  B4(Object... a) {
        return null;
    }
}
