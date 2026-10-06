package com.github.rudroid.projects.table;

/* loaded from: /home/user/work/p/classes.dex */
public final class f1<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f17876r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f17877s;

    public f1(y71.j jVar, c0 c0Var) {
        this.f17876r = jVar;
        this.f17877s = c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (k71.k.b(r6 != null ? r6.e : null, com.github.rudroid.projects.table.c0.R(r4.f17877s)) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e1 e1Var;
        int i;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i10 = e1Var.f17873v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e1Var.f17873v = i10 - Integer.MIN_VALUE;
                Object obj2 = e1Var.f17872u;
                b71.a aVar = b71.a.r;
                i = e1Var.f17873v;
                if (i != 0) {
                    sy.y.j(obj2);
                    com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                    if (com.github.rudroid.utilities.ui.h1.g(g1Var) || (g1Var instanceof com.github.rudroid.utilities.ui.h0)) {
                        jl.a aVar2 = (jl.a) g1Var.getData();
                    }
                    e1Var.f17873v = 1;
                    if (this.f17876r.c(obj, e1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        e1Var = new e1(this, cVar);
        Object obj22 = e1Var.f17872u;
        b71.a aVar3 = b71.a.r;
        i = e1Var.f17873v;
        if (i != 0) {
        }
        return w61.a0.a;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c0 {
        public c0() {
        }
    }
}
