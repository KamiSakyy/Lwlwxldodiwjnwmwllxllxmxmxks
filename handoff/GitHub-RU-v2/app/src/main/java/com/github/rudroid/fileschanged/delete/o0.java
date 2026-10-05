package com.github.rudroid.fileschanged.delete;

import ad.a;
import com.github.rudroid.utilities.c1;
import com.github.rudroid.webview.adapters.g;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PatchStatus;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import yz0.a4;
import yz0.b4;
import yz0.m1;
import yz0.w3;
import yz0.x3;
import yz0.y3;
import yz0.z3;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f13209r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f13210s;

    public o0(y71.j jVar, f0 f0Var) {
        this.f13209r = jVar;
        this.f13210s = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n0 n0Var;
        int i;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i11 = n0Var.f13207v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n0Var.f13207v = i11 - Integer.MIN_VALUE;
                Object obj2 = n0Var.f13206u;
                b71.a aVar = b71.a.r;
                i = n0Var.f13207v;
                int i12 = 1;
                if (i != 0) {
                    sy.y.j(obj2);
                    a4 a4Var = (b4) obj;
                    f0 f0Var = this.f13210s;
                    w wVar = f0Var.B;
                    String str = f0Var.I;
                    wVar.getClass();
                    k71.k.g(a4Var, "repoFile");
                    k71.k.g(str, "filePath");
                    if (a4Var instanceof a4) {
                        arrayList2 = a4Var.k;
                    } else if (a4Var instanceof z3) {
                        arrayList2 = ((z3) a4Var).j;
                    } else {
                        if (!(a4Var instanceof x3) && !(a4Var instanceof w3) && !(a4Var instanceof y3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList = x61.r.r;
                        i10 = 1;
                        n0Var.f13207v = i10;
                        if (this.f13209r.c(arrayList, n0Var) == aVar) {
                            return aVar;
                        }
                    }
                    arrayList = new ArrayList();
                    String str2 = str;
                    arrayList.add(new g.c(new a.g(null, c1.a(str), str2, null, false, false, null, null, 0, arrayList2.size(), PatchStatus.DELETED, null, null, false, null, null, false, false, false, 226552)));
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        m1 m1Var = (m1) arrayList2.get(i13);
                        String str3 = m1Var.a;
                        int i14 = m1Var.b;
                        int i15 = m1Var.c;
                        String str4 = str2;
                        str2 = str4;
                        arrayList.add(new g.c(new a.c(null, str3, "", i14, i15, -1, no.a.k("L", i15), str4, str4, DiffLineType.DELETION, m1Var.c)));
                        i13++;
                        i12 = 1;
                    }
                    i10 = i12;
                    n0Var.f13207v = i10;
                    if (this.f13209r.c(arrayList, n0Var) == aVar) {
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
        n0Var = new n0(this, cVar);
        Object obj22 = n0Var.f13206u;
        b71.a aVar2 = b71.a.r;
        i = n0Var.f13207v;
        int i122 = 1;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
