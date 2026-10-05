package com.github.rudroid.copilot.inapppurchase.billingclient;

import com.github.rudroid.copilot.inapppurchase.billingclient.j;
import java.util.List;
import x61.r;
import x9.o;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f9664a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f9665b;

    public g() {
        y1 c10 = n1.c(j.b.f9668a);
        this.f9664a = c10;
        this.f9665b = new i1(c10);
    }

    public final void a(x9.h hVar, List list) {
        k71.k.g(hVar, "billingResult");
        int i = hVar.f34005a;
        y1 y1Var = this.f9664a;
        if (i == 0) {
            if (list == null) {
                list = r.r;
            }
            j.c cVar = new j.c(list);
            y1Var.getClass();
            y1Var.k((Object) null, cVar);
            return;
        }
        if (i != 1) {
            y1Var.getClass();
            y1Var.k((Object) null, j.a.f9667a);
        } else {
            y1Var.getClass();
            y1Var.k((Object) null, j.d.f9670a);
        }
    }
}
