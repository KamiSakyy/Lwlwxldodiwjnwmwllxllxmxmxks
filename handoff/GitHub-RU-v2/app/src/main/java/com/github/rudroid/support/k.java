package com.github.rudroid.support;

import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import com.github.rudroid.activities.h0;
import com.github.rudroid.activities.m0;
import com.github.rudroid.fragments.GitHubFragment;
import com.github.rudroid.support.b;
import com.github.rudroid.utilities.k2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.n0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.d0Shadow;

@c71.e(c = "com.github.rudroid.support.SupportFragment$onViewCreated$3", f = "SupportFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SupportFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SupportFragment supportFragment, a71.c cVar) {
        super(2, cVar);
        this.w = supportFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        k kVar = new k(this.w, cVar);
        kVar.v = obj;
        return kVar;
    }

    public final Object s(Object obj, Object obj2) {
        k r = r((a71.c) obj2, (g1) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        h0 u4;
        g1 g1Var = (g1) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        boolean z = g1Var instanceof n0;
        SupportFragment supportFragment = this.w;
        if (z && (u4 = supportFragment.u4(((n0) g1Var).b)) != null) {
            GitHubFragment.z4(supportFragment, u4.a, 0, (m0.b) null, supportFragment.B4().R, (k2.a) null, (ComposeView) null, 54);
        }
        h hVar = (h) g1Var.getData();
        if (hVar != null) {
            List n = d0Shadow.n(new b.C0008b(null, 0));
            List list = hVar.a;
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new b.c((Uri) it.next()));
            }
            ArrayList l0 = x61.m.l0(n, arrayList);
            e eVar = supportFragment.G0;
            eVar.getClass();
            ArrayList arrayList2 = eVar.g;
            arrayList2.clear();
            arrayList2.addAll(l0);
            eVar.n();
            TextInputLayout textInputLayout = supportFragment.B4().V;
            g gVar = hVar.e;
            textInputLayout.setError(gVar != null ? supportFragment.C3(SupportFragment.I4(supportFragment, gVar)) : null);
            TextInputLayout textInputLayout2 = supportFragment.B4().P;
            g gVar2 = hVar.d;
            textInputLayout2.setError(gVar2 != null ? supportFragment.C3(SupportFragment.I4(supportFragment, gVar2)) : null);
        }
        return w61.a0.a;
    }
}
