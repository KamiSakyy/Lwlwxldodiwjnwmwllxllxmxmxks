package com.github.rudroid.accounts;

import java.util.ArrayList;
import java.util.List;
import y71.g1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class e0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f4369r;

    public e0(b0 b0Var) {
        this.f4369r = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r9 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, a71.c cVar) {
        d0 d0Var;
        int i;
        g1 g1Var;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i10 = d0Var.f4358x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d0Var.f4358x = i10 - Integer.MIN_VALUE;
                Object obj = d0Var.f4356v;
                b71.a aVar = b71.a.r;
                i = d0Var.f4358x;
                if (i != 0) {
                    sy.y.j(obj);
                    b0 b0Var = this.f4369r;
                    g1 g1Var2 = b0Var.f4348y;
                    kj.w wVar = b0Var.f4345v;
                    cd0.a aVar2 = new cd0.a(23);
                    d0Var.f4355u = g1Var2;
                    d0Var.f4358x = 1;
                    obj = wVar.a(list, aVar2, d0Var);
                    if (obj != aVar) {
                        g1Var = g1Var2;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g1Var = d0Var.f4355u;
                    sy.y.j(obj);
                    ((y1) g1Var).j(obj);
                    return w61.a0.a;
                }
                g1Var = d0Var.f4355u;
                sy.y.j(obj);
                d0Var.f4355u = g1Var;
                d0Var.f4358x = 2;
                obj = n1.H((y71.i) obj, new ArrayList(), d0Var);
            }
        }
        d0Var = new d0(this, cVar);
        Object obj2 = d0Var.f4356v;
        b71.a aVar3 = b71.a.r;
        i = d0Var.f4358x;
        if (i != 0) {
        }
        d0Var.f4355u = g1Var;
        d0Var.f4358x = 2;
        obj2 = n1.H((y71.i) obj2, new ArrayList(), d0Var);
    }
}
