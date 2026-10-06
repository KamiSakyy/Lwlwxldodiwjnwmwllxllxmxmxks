package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import a5.c1;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.domain.searchandfilter.filters.data.notification.CustomNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.RepositoryNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.SpacerNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;
import ic.mc;
import ic.pf;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l extends com.github.rudroid.searchandfilter.complexfilter.e0<k> {
    public static final a Companion = new a();
    public SearchAndFilterBaseFragment f;

    public static final class a {
    }

    public l(SearchAndFilterBaseFragment searchAndFilterBaseFragment) {
        this.f = searchAndFilterBaseFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        k kVar = (k) obj;
        k71.k.g(kVar, "item");
        return kVar.a.getId();
    }

    public final int m(int i) {
        com.github.domain.searchandfilter.filters.data.notification.a aVar = ((k) this.d.get(i)).a;
        if (aVar instanceof CustomNotificationFilter) {
            return 0;
        }
        if (aVar instanceof SpacerNotificationFilter) {
            return 1;
        }
        if (aVar instanceof StatusNotificationFilter) {
            return 2;
        }
        if (aVar instanceof RepositoryNotificationFilter) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void v(n1 n1Var, int i) {
        ArrayList arrayList = this.d;
        com.github.domain.searchandfilter.filters.data.notification.a aVar = ((k) arrayList.get(i)).a;
        if (aVar instanceof CustomNotificationFilter) {
            g0 g0Var = n1Var instanceof g0 ? (g0) n1Var : null;
            if (g0Var != null) {
                k kVar = (k) arrayList.get(i);
                CustomNotificationFilter customNotificationFilter = (CustomNotificationFilter) aVar;
                pf pfVar = g0Var.u;
                k71.k.g(kVar, "item");
                int i2 = customNotificationFilter.v;
                boolean z = kVar.b;
                if (z) {
                    ((k5.f) pfVar).A.setOnClickListener(null);
                    ((k5.f) pfVar).A.setClickable(false);
                } else {
                    ((k5.f) pfVar).A.setClickable(true);
                    ((k5.f) pfVar).A.setOnClickListener(new cd.n(11, g0Var, kVar));
                }
                TextView textView = pfVar.P;
                View view = ((k5.f) pfVar).A;
                TextView textView2 = pfVar.O;
                textView.setText(customNotificationFilter.t);
                k71.k.f(textView2, "countText");
                textView2.setVisibility(i2 > 0 ? 0 : 8);
                textView2.setText(String.valueOf(i2));
                ImageView imageView = pfVar.Q;
                k71.k.f(imageView, "selected");
                imageView.setVisibility(z ? 0 : 8);
                if (i2 > 0) {
                    textView2.setContentDescription(view.getContext().getResources().getQuantityString(2131820590, i2, Integer.valueOf(i2)));
                } else {
                    textView2.setContentDescription(null);
                }
                c1.r(view, view.getContext().getString(z ? 2131954108 : 2131953737));
                if (z) {
                    c1.m(view, b5.b.e.a());
                    c1.i(view, 0);
                    return;
                } else {
                    String string = view.getContext().getString(2131954106);
                    k71.k.f(string, "getString(...)");
                    c1.n(view, b5.b.e, string, (b5.o) null);
                    return;
                }
            }
            return;
        }
        if (!(aVar instanceof StatusNotificationFilter)) {
            if (!(aVar instanceof RepositoryNotificationFilter)) {
                if (!k71.k.b(aVar, SpacerNotificationFilter.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            j0 j0Var = n1Var instanceof j0 ? (j0) n1Var : null;
            if (j0Var != null) {
                k kVar2 = (k) arrayList.get(i);
                RepositoryNotificationFilter repositoryNotificationFilter = (RepositoryNotificationFilter) aVar;
                k71.k.g(kVar2, "item");
                mc mcVar = j0Var.u;
                ((k5.f) mcVar).A.setOnClickListener(new cd.n(12, j0Var, kVar2));
                mcVar.P0(repositoryNotificationFilter);
                ImageView imageView2 = mcVar.R;
                k71.k.f(imageView2, "selected");
                boolean z2 = kVar2.b;
                imageView2.setVisibility(z2 ? 0 : 8);
                TextView textView3 = mcVar.O;
                View view2 = ((k5.f) mcVar).A;
                Resources resources = view2.getResources();
                int i3 = repositoryNotificationFilter.w;
                textView3.setContentDescription(resources.getQuantityString(2131820590, i3, Integer.valueOf(i3)));
                c1.r(view2, view2.getContext().getString(z2 ? 2131954108 : 2131953737));
                String string2 = !z2 ? view2.getContext().getString(2131954106) : view2.getContext().getString(2131953736);
                k71.k.d(string2);
                c1.n(view2, b5.b.e, string2, (b5.o) null);
                return;
            }
            return;
        }
        z0 z0Var = n1Var instanceof z0 ? (z0) n1Var : null;
        if (z0Var != null) {
            k kVar3 = (k) arrayList.get(i);
            StatusNotificationFilter statusNotificationFilter = (StatusNotificationFilter) aVar;
            pf pfVar2 = z0Var.u;
            k71.k.g(kVar3, "item");
            int i4 = statusNotificationFilter.v;
            boolean z3 = kVar3.b;
            if (z3) {
                ((k5.f) pfVar2).A.setOnClickListener(null);
                ((k5.f) pfVar2).A.setClickable(false);
            } else {
                ((k5.f) pfVar2).A.setClickable(true);
                ((k5.f) pfVar2).A.setOnClickListener(new cd.n(13, z0Var, kVar3));
            }
            TextView textView4 = pfVar2.P;
            View view3 = ((k5.f) pfVar2).A;
            TextView textView5 = pfVar2.O;
            Context context = view3.getContext();
            k71.k.f(context, "getContext(...)");
            textView4.setText(statusNotificationFilter.h(context));
            k71.k.f(textView5, "countText");
            textView5.setVisibility(i4 > 0 ? 0 : 8);
            textView5.setText(String.valueOf(i4));
            ImageView imageView3 = pfVar2.Q;
            k71.k.f(imageView3, "selected");
            imageView3.setVisibility(z3 ? 0 : 8);
            if (i4 > 0) {
                textView5.setContentDescription(view3.getContext().getResources().getQuantityString(2131820590, i4, Integer.valueOf(i4)));
            } else {
                textView5.setContentDescription(null);
            }
            c1.r(view3, view3.getContext().getString(z3 ? 2131954108 : 2131953737));
            if (z3) {
                c1.m(view3, b5.b.e.a());
                c1.i(view3, 0);
            } else {
                String string3 = view3.getContext().getString(2131954106);
                k71.k.f(string3, "getString(...)");
                c1.n(view3, b5.b.e, string3, (b5.o) null);
            }
        }
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        SearchAndFilterBaseFragment searchAndFilterBaseFragment = this.f;
        if (i == 0) {
            pf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559267, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            return new g0(b, searchAndFilterBaseFragment);
        }
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131559268, viewGroup, false);
            k71.k.f(inflate, "inflate(...)");
            return new y0(inflate);
        }
        if (i == 2) {
            pf b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559267, viewGroup, false, k5.b.b);
            k71.k.f(b2, "inflate(...)");
            return new z0(b2, searchAndFilterBaseFragment);
        }
        if (i != 3) {
            throw new IllegalStateException("unknown view type");
        }
        mc b3 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559225, viewGroup, false, k5.b.b);
        k71.k.f(b3, "inflate(...)");
        return new j0(b3, searchAndFilterBaseFragment);
    }
}
