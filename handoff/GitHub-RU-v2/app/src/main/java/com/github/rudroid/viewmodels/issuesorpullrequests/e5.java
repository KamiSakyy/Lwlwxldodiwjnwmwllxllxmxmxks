package com.github.rudroid.viewmodels.issuesorpullrequests;

/* loaded from: /home/user/work/p/classes3.dex */
final class e5<T> implements y71.j {
    public final /* synthetic */ w2 r;
    public final /* synthetic */ fl.b s;

    public e5(w2 w2Var, fl.b bVar) {
        this.r = w2Var;
        this.s = bVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        c11.a aVar = (c11.a) obj;
        w2 w2Var = this.r;
        if (aVar != null) {
            String str = aVar.a;
            String str2 = aVar.b;
            int i = aVar.c;
            androidx.lifecycle.a1 a1Var = w2Var.T;
            a1Var.c(str, "EXTRA_REPOSITORY_OWNER");
            a1Var.c(str2, "EXTRA_REPOSITORY_NAME");
            a1Var.c(Integer.valueOf(i), "EXTRA_NUMBER");
            w2Var.Z();
        } else {
            w2.S(w2Var, this.s);
        }
        return w61.a0.a;
    }
}
