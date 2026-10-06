package com.github.rudroid.searchandfilter.filter.sort;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.github.rudroid.common.m0;
import com.github.rudroid.searchandfilter.filter.sort.FilterSortFragment;
import com.github.rudroid.searchandfilter.q;
import com.github.rudroid.utilities.b;
import com.github.service.models.response.type.MobileSubjectType;
import ic.y2;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.w;
import w61.p;
import wf.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class FilterSortFragment extends Hilt_FilterSortFragment<y2> implements s<m0> {
    public static final a Companion = new a();
    public p F0;
    public p H0;
    public final wf.a E0 = new wf.a(this);
    public final int G0 = 2131558797;

    public static final class a {
    }

    public FilterSortFragment() {
        final int i = 0;
        this.F0 = w.t(new j71.a(this) { // from class: wf.d
            public final /* synthetic */ FilterSortFragment s;

            {
                this.s = this;
            }

            public final Object a() {
                String string;
                m0 valueOf;
                switch (i) {
                    case 0:
                        return new com.github.rudroid.utilities.b(this.s.i4());
                    default:
                        Bundle bundle = ((a0) this.s).x;
                        if (bundle == null || (string = bundle.getString("EXTRA_FILTER")) == null || (valueOf = m0.valueOf(string)) == null) {
                            throw new IllegalStateException("Filter not set.");
                        }
                        return valueOf;
                }
            }
        });
        final int i2 = 1;
        this.H0 = w.t(new j71.a(this) { // from class: wf.d
            public final /* synthetic */ FilterSortFragment s;

            {
                this.s = this;
            }

            public final Object a() {
                String string;
                m0 valueOf;
                switch (i2) {
                    case 0:
                        return new com.github.rudroid.utilities.b(this.s.i4());
                    default:
                        Bundle bundle = ((a0) this.s).x;
                        if (bundle == null || (string = bundle.getString("EXTRA_FILTER")) == null || (valueOf = m0.valueOf(string)) == null) {
                            throw new IllegalStateException("Filter not set.");
                        }
                        return valueOf;
                }
            }
        });
    }

    public final int C4() {
        return this.G0;
    }

    public final void c4(View view, Bundle bundle) {
        k.g(view, "view");
        RecyclerView recyclerView = B4().N;
        wf.a aVar = this.E0;
        recyclerView.setAdapter(aVar);
        aVar.f = (m0) this.H0.getValue();
        aVar.n();
    }

    @Override // wf.s
    public final void m0(Object obj) {
        String string;
        m0 m0Var = (m0) obj;
        k.g(m0Var, "filter");
        FilterSortBottomSheetDialog filterSortBottomSheetDialog = ((a0) this).P;
        FilterSortBottomSheetDialog filterSortBottomSheetDialog2 = filterSortBottomSheetDialog instanceof FilterSortBottomSheetDialog ? filterSortBottomSheetDialog : null;
        if (filterSortBottomSheetDialog2 != null) {
            p pVar = filterSortBottomSheetDialog2.X0;
            b bVar = (b) this.F0.getValue();
            Context i4 = i4();
            switch (m0Var.ordinal()) {
                case 0:
                    string = i4.getString(2131954150);
                    k.f(string, "getString(...)");
                    break;
                case 1:
                    string = i4.getString(2131954151);
                    k.f(string, "getString(...)");
                    break;
                case 2:
                    string = i4.getString(2131954141);
                    k.f(string, "getString(...)");
                    break;
                case 3:
                    string = i4.getString(2131954139);
                    k.f(string, "getString(...)");
                    break;
                case 4:
                    string = i4.getString(2131954152);
                    k.f(string, "getString(...)");
                    break;
                case 5:
                    string = i4.getString(2131954140);
                    k.f(string, "getString(...)");
                    break;
                case 6:
                    string = i4.getString(2131954149);
                    k.f(string, "getString(...)");
                    break;
                case 7:
                    string = i4.getString(2131954148);
                    k.f(string, "getString(...)");
                    break;
                case 8:
                    string = i4.getString(2131954146);
                    k.f(string, "getString(...)");
                    break;
                case 9:
                    string = i4.getString(2131954145);
                    k.f(string, "getString(...)");
                    break;
                case 10:
                    string = i4.getString(2131954142);
                    k.f(string, "getString(...)");
                    break;
                case 11:
                    string = i4.getString(2131954144);
                    k.f(string, "getString(...)");
                    break;
                case 12:
                    string = i4.getString(2131954147);
                    k.f(string, "getString(...)");
                    break;
                case 13:
                    string = i4.getString(2131954143);
                    k.f(string, "getString(...)");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            bVar.b(string);
            if (m0Var == ((m0) this.H0.getValue())) {
                ((q) pVar.getValue()).Y(new SortFilter(), MobileSubjectType.FILTER_SORT);
                filterSortBottomSheetDialog2.s4();
            } else {
                ((q) pVar.getValue()).Y(new SortFilter(m0Var), MobileSubjectType.FILTER_SORT);
                filterSortBottomSheetDialog2.s4();
            }
        }
    }

    public static Object n4(Object... a) {
        return null;
    }

    public static Object i4(Object... a) {
        return null;
    }

    public static Object B4(Object... a) {
        return null;
    }
}
