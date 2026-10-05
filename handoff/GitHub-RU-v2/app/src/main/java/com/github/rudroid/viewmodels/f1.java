package com.github.rudroid.viewmodels;

/* JADX INFO: Access modifiers changed from: package-private */
@c71.e(c = "com.github.rudroid.viewmodels.GlobalSearchViewModel$searchText$1", f = "GlobalSearchViewModel.kt", l = {104}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g1 w;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fl.c.values().length];
            try {
                fl.c cVar = fl.c.r;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.w = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f1(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g1 g1Var = this.w;
            yk.b bVar = g1Var.s;
            oa.j d = g1Var.u.d();
            String str = g1Var.w;
            com.github.rudroid.support.u uVar = new com.github.rudroid.support.u(9, g1Var);
            bVar.getClass();
            k71.k.g(str, "query");
            y71.y J = b31.b.J(((z01.z) bVar.a.a(d)).b(str, !d.f(com.github.rudroid.common.a.K)), d, uVar);
            e1 e1Var = new e1(g1Var);
            this.v = 1;
            if (J.b(e1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
