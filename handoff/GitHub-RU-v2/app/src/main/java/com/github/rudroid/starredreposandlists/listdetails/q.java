package com.github.rudroid.starredreposandlists.listdetails;

import android.R;
import android.content.DialogInterface;
import androidx.lifecycle.d1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.starredreposandlists.navigation.EditListRoute;
import com.github.rudroid.utilities.ui.g1;
import y71.n1;
import y71.y1;
import yz0.p2;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class q extends k71.i implements j71.c {
    public final Object k(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "p0");
        final ListDetailFragment listDetailFragment = (ListDetailFragment) ((k71.c) this).s;
        listDetailFragment.getClass();
        if (str.equals("edit_list_menu_item")) {
            RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
            ei.c cVar = ei.c.w;
            runtimeFeatureFlag.getClass();
            if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(listDetailFragment)) {
                x6.a0 i = sy.s.i(listDetailFragment);
                String str2 = (String) listDetailFragment.C4().z.r.getValue();
                k71.k.g(i, "<this>");
                k71.k.g(str2, "slug");
                com.github.rudroid.main.navigation.f.c(i, new EditListRoute(str2), (x6.d0) null, 6);
            } else {
                androidx.fragment.app.t tVar = listDetailFragment.H0;
                if (tVar == null) {
                    k71.k.m("activityResultLauncher");
                    throw null;
                }
                tVar.a(listDetailFragment.C4().z.r.getValue());
            }
        } else if (str.equals("delete_list_menu_item")) {
            b21.v vVar = new b21.v(listDetailFragment.i4());
            String C3 = listDetailFragment.C3(2131953012);
            k.d dVar = (k.d) vVar.t;
            dVar.d = C3;
            dVar.f = listDetailFragment.C3(2131953011);
            final int i2 = 0;
            vVar.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.rudroid.starredreposandlists.listdetails.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (i2) {
                        case 0:
                            ListDetailFragment listDetailFragment2 = listDetailFragment;
                            s0 C4 = listDetailFragment2.C4();
                            fl.f.Companion.getClass();
                            y1 c = n1.c(fl.e.b(w61.a0.a));
                            p2 p2Var = (p2) ((g1) C4.A.getValue()).getData();
                            if (p2Var != null) {
                                v71.b0.z(d1.k(C4), (a71.h) null, (v71.a0) null, new j0(C4, p2Var.a, c, null), 3);
                            }
                            com.github.rudroid.utilities.w0.a(c, listDetailFragment2.F3(), androidx.lifecycle.w.u, new n(listDetailFragment2, null));
                            break;
                        default:
                            ListDetailFragment listDetailFragment3 = listDetailFragment;
                            ((com.github.rudroid.utilities.b) listDetailFragment3.I0.getValue()).b(listDetailFragment3.C3(2131953847));
                            break;
                    }
                }
            });
            final int i3 = 1;
            vVar.w(2131951840, new DialogInterface.OnClickListener() { // from class: com.github.rudroid.starredreposandlists.listdetails.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i32) {
                    switch (i3) {
                        case 0:
                            ListDetailFragment listDetailFragment2 = listDetailFragment;
                            s0 C4 = listDetailFragment2.C4();
                            fl.f.Companion.getClass();
                            y1 c = n1.c(fl.e.b(w61.a0.a));
                            p2 p2Var = (p2) ((g1) C4.A.getValue()).getData();
                            if (p2Var != null) {
                                v71.b0.z(d1.k(C4), (a71.h) null, (v71.a0) null, new j0(C4, p2Var.a, c, null), 3);
                            }
                            com.github.rudroid.utilities.w0.a(c, listDetailFragment2.F3(), androidx.lifecycle.w.u, new n(listDetailFragment2, null));
                            break;
                        default:
                            ListDetailFragment listDetailFragment3 = listDetailFragment;
                            ((com.github.rudroid.utilities.b) listDetailFragment3.I0.getValue()).b(listDetailFragment3.C3(2131953847));
                            break;
                    }
                }
            });
            vVar.A();
        }
        return w61.a0.a;
    }
}
