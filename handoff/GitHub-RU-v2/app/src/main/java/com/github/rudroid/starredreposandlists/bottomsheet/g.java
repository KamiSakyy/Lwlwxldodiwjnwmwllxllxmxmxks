package com.github.rudroid.starredreposandlists.bottomsheet;

import com.github.rudroid.m0;
import com.github.rudroid.starredreposandlists.bottomsheet.ListSelectionBottomSheet;
import java.util.ArrayList;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ g(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        int i = this.r;
        ArrayList arrayList = null;
        w61.a0 a0Var = w61.a0.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                String str = (String) obj;
                ListSelectionBottomSheet.a aVar = ListSelectionBottomSheet.Companion;
                k71.k.g(str, "it");
                w I4 = ((ListSelectionBottomSheet) obj2).I4();
                ArrayList arrayList2 = I4.x;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList2.get(i3);
                        i3++;
                        if (k71.k.b((String) obj3, str)) {
                            arrayList = new ArrayList();
                            int size2 = arrayList2.size();
                            while (i2 < size2) {
                                Object obj4 = arrayList2.get(i2);
                                i2++;
                                if (!k71.k.b((String) obj4, str)) {
                                    arrayList.add(obj4);
                                }
                            }
                            I4.x = arrayList;
                            I4.P();
                            break;
                        }
                    }
                }
                if (arrayList2 != null) {
                    arrayList = x61.m.m0(arrayList2, str);
                }
                I4.x = arrayList;
                I4.P();
                break;
            case 1:
                y1 y1Var = ((w) obj2).y;
                m0.t(fl.f.Companion, (fl.b) obj, ((fl.f) y1Var.getValue()).b, y1Var, (Object) null);
                break;
            default:
                g0 g0Var = (g0) obj2;
                fl.b bVar = (fl.b) obj;
                g0Var.getClass();
                k71.k.g(bVar, "executionError");
                g0Var.s.a(bVar);
                break;
        }
        return a0Var;
    }
}
