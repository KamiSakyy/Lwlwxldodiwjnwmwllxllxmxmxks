package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.m8;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.viewmodels.TriageLegacyProjectsViewModel$loadNextPage$1", f = "TriageLegacyProjectsViewModel.kt", l = {313, 321, 335, 343}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v8 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m8 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(m8 m8Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = m8Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v8(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00aa, code lost:
    
        if (((y71.i) r0).b(r1, r12) == r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((y71.i) r0).b(r1, r12) == r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r0 == r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r0 == r9) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object a;
        Object a2;
        m8 m8Var = this.w;
        com.github.rudroid.activities.util.c cVar = m8Var.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            m8.b bVar = m8Var.x;
            if (k71.k.b(bVar, m8.b.a.b)) {
                km.b bVar2 = m8Var.s;
                oa.j d = cVar.d();
                String str = m8Var.K;
                String str2 = m8Var.J;
                String str3 = m8Var.l().b;
                n8 n8Var = new n8(m8Var, 2);
                this.v = 1;
                a2 = bVar2.a(d, str, str2, this.x, str3, n8Var, this);
            } else {
                if (!k71.k.b(bVar, m8.b.C0016b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                km.d dVar = m8Var.t;
                oa.j d2 = cVar.d();
                String str4 = m8Var.K;
                String str5 = m8Var.J;
                String str6 = m8Var.l().b;
                n8 n8Var2 = new n8(m8Var, 3);
                this.v = 3;
                a = dVar.a(d2, str4, str5, this.x, str6, n8Var2, this);
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    sy.y.j(obj);
                    a = obj;
                    u8 u8Var = new u8(m8Var);
                    this.v = 4;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            sy.y.j(obj);
            return w61.a0.a;
        }
        sy.y.j(obj);
        a2 = obj;
        t8 t8Var = new t8(m8Var);
        this.v = 2;
    }
}
