package com.github.rudroid.starredreposandlists.bottomsheet;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.viewmodel.d;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 extends k1 implements com.github.rudroid.utilities.viewmodel.d {
    public final /* synthetic */ d.a s;
    public xm.c t;
    public com.github.rudroid.activities.util.c u;

    public g0(xm.c cVar, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(cVar, "updateUserListsForItemUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.s = new d.a();
        this.t = cVar;
        this.u = cVar2;
    }

    public final void P(String str, List list, List list2) {
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new f0(this, str, list, list2, null), 3);
    }
}
