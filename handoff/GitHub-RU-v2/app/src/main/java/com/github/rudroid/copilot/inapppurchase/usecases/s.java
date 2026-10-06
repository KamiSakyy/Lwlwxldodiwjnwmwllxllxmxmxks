package com.github.rudroid.copilot.inapppurchase.usecases;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public class s<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9803r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9804s;

    public s(y71.j jVar, String str) {
        this.f9803r = jVar;
        this.f9804s = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        r rVar;
        int i;
        Object obj2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f9800v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f9800v = i10 - Integer.MIN_VALUE;
                Object obj3 = rVar.f9799u;
                b71.a aVar = b71.a.r;
                i = rVar.f9800v;
                if (i != 0) {
                    sy.y.j(obj3);
                    Iterator<T> it = ((List) obj).iterator();
                    while (true) {
                        obj2 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        ArrayList a10 = ((Purchase) next).a();
                        int size = a10.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                break;
                            }
                            Object obj4 = a10.get(i11);
                            i11++;
                            if (k71.k.b((String) obj4, this.f9804s)) {
                                obj2 = obj4;
                                break;
                            }
                        }
                        if (obj2 != null) {
                            obj2 = next;
                            break;
                        }
                    }
                    rVar.f9800v = 1;
                    if (this.f9803r.c(obj2, rVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj3);
                }
                return w61.a0.a;
            }
        }
        rVar = new r(this, cVar);
        Object obj32 = rVar.f9799u;
        b71.a aVar2 = b71.a.r;
        i = rVar.f9800v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
