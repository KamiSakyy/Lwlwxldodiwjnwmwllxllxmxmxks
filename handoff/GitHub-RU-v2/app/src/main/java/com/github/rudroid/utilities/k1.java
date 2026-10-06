package com.github.rudroid.utilities;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k1 implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.e s;

    public /* synthetic */ k1(int i, j71.e eVar) {
        this.r = i;
        this.s = eVar;
    }

    public final Object s(Object obj, Object obj2) {
        u1.e eVar;
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        j71.e eVar2 = this.s;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    eVar2.s(sVar, 0);
                } else {
                    sVar.V();
                }
                return a0Var;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    eVar2.s(sVar2, 0);
                } else {
                    sVar2.V();
                }
                return a0Var;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                float f = qg.pShadow.a;
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    androidx.compose.runtime.t.a(f1.e.f(((f1.y1) sVar3.j(f1.z1.a)).q, f1.g2.a), eVar2, sVar3, 8);
                } else {
                    sVar3.V();
                }
                return a0Var;
            case 3:
                u1.a aVar = (u1.a) obj;
                List list = (List) eVar2.s(aVar, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (eVar = aVar.s) != null && !eVar.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 4:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    eVar2.s(sVar4, 0);
                } else {
                    sVar4.V();
                }
                return a0Var;
            default:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (sVar5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    eVar2.s(sVar5, 0);
                } else {
                    sVar5.V();
                }
                return a0Var;
        }
    }
}
