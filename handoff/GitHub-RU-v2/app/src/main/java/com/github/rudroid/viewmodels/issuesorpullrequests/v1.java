package com.github.rudroid.viewmodels.issuesorpullrequests;

/* loaded from: /home/user/work/p/classes3.dex */
final class v1<T> implements y71.j {
    public final /* synthetic */ l r;
    public final /* synthetic */ fl.b s;

    public v1(l lVar, fl.b bVar) {
        this.r = lVar;
        this.s = bVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        c11.a aVar = (c11.a) obj;
        l lVar = this.r;
        if (aVar != null) {
            String str = aVar.a;
            String str2 = aVar.b;
            int i = aVar.c;
            androidx.lifecycle.a1 a1Var = lVar.T;
            a1Var.c(str, "EXTRA_REPOSITORY_OWNER");
            a1Var.c(str2, "EXTRA_REPOSITORY_NAME");
            a1Var.c(Integer.valueOf(i), "EXTRA_NUMBER");
            lVar.Z();
        } else {
            l.S(lVar, this.s);
        }
        return w61.a0.a;
    }
}
