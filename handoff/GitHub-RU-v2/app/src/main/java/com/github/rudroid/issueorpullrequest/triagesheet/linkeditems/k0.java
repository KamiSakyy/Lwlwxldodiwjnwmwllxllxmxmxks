package com.github.rudroid.issueorpullrequest.triagesheet.linkeditems;

import com.github.rudroid.issueorpullrequest.triagesheet.linkeditems.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import yz0.o2;

/* loaded from: /home/user/work/p/classes.dex */
public final class k0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f16425r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f16426s;

    public k0(y71.j jVar, r rVar) {
        this.f16425r = jVar;
        this.f16426s = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        j0 j0Var;
        int i;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.f16422v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j0Var.f16422v = i10 - Integer.MIN_VALUE;
                Object obj2 = j0Var.f16421u;
                b71.a aVar = b71.a.r;
                i = j0Var.f16422v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = (List) obj;
                    this.f16426s.f16447z.getClass();
                    k71.k.g(list, "selectedItems");
                    h.f fVar = new h.f(2131952995);
                    ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new h.c((o2) it.next()));
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    Collection collection = arrayList;
                    if (isEmpty) {
                        collection = sy.d0.n(new h.d());
                    }
                    ArrayList l02 = x61.m.l0(sy.d0.n(fVar), collection);
                    j0Var.f16422v = 1;
                    if (this.f16425r.c(l02, j0Var) == aVar) {
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
        j0Var = new j0(this, cVar);
        Object obj22 = j0Var.f16421u;
        b71.a aVar2 = b71.a.r;
        i = j0Var.f16422v;
        if (i != 0) {
        }
        return w61.a0.a;
    }





}
