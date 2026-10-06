package com.github.rudroid.searchandfilter.complexfilter;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.d1;
import androidx.lifecycle.p0;
import com.github.rudroid.searchandfilter.complexfilter.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class y implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ y(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                SearchAndFilterBaseFragment searchAndFilterBaseFragment = (SearchAndFilterBaseFragment) obj2;
                fl.f fVar = (fl.f) obj;
                fl.g gVar = fVar.a;
                Object obj3 = fVar.b;
                int ordinal = gVar.ordinal();
                int i2 = 0;
                if (ordinal == 0) {
                    e0 H4 = searchAndFilterBaseFragment.H4();
                    H4.getClass();
                    ArrayList arrayList = H4.d;
                    arrayList.clear();
                    arrayList.addAll(x61.rShadow.r);
                    H4.n();
                    ProgressBar progressBar = searchAndFilterBaseFragment.B4().P;
                    k71.k.f(progressBar, "progressBar");
                    progressBar.setVisibility(0);
                    TextView textView = searchAndFilterBaseFragment.B4().N;
                    k71.k.f(textView, "emptyStateTitle");
                    textView.setVisibility(8);
                    break;
                } else if (ordinal == 1) {
                    List list = (List) obj3;
                    if (list != null) {
                        e0 H42 = searchAndFilterBaseFragment.H4();
                        H42.getClass();
                        ArrayList arrayList2 = H42.d;
                        arrayList2.clear();
                        arrayList2.addAll(list);
                        H42.n();
                    }
                    ProgressBar progressBar2 = searchAndFilterBaseFragment.B4().P;
                    k71.k.f(progressBar2, "progressBar");
                    progressBar2.setVisibility(8);
                    TextView textView2 = searchAndFilterBaseFragment.B4().N;
                    k71.k.f(textView2, "emptyStateTitle");
                    if (obj3 != null && !((Collection) obj3).isEmpty()) {
                        i2 = 8;
                    }
                    textView2.setVisibility(i2);
                    q1 q1Var = searchAndFilterBaseFragment.D0;
                    if (q1Var != null) {
                        q1Var.m((CancellationException) null);
                    }
                    searchAndFilterBaseFragment.D0 = v71.b0.z(d1.i(searchAndFilterBaseFragment.F3()), (a71.h) null, (v71.a0Shadow) null, new b0(searchAndFilterBaseFragment, fVar, null), 3);
                    break;
                }
                break;
            default:
                b bVar = (b) obj2;
                fl.b bVar2 = (fl.b) obj;
                b.a aVar = b.Companion;
                k71.k.g(bVar2, "it");
                p0 p0Var = bVar.v;
                fl.e eVar = fl.f.Companion;
                List U = bVar.U();
                eVar.getClass();
                p0Var.j(fl.e.a(bVar2, U));
                break;
        }
        return a0Var;
    }
}
