package com.github.rudroid.repositorycreation.templaterepository;

import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class u implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20485r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f20486s;

    public /* synthetic */ u(int i, Object obj) {
        this.f20485r = i;
        this.f20486s = obj;
    }

    public final Object k(Object obj) {
        switch (this.f20485r) {
            case k5.f.J:
                t tVar = (t) this.f20486s;
                fl.b bVar = (fl.b) obj;
                y1 y1Var = tVar.f20483y;
                p01.p pVar = (p01.p) ((g1) y1Var.getValue()).getData();
                ArrayList arrayList = pVar != null ? pVar.a : null;
                tVar.Q(y1Var, bVar, arrayList == null || arrayList.isEmpty());
                break;
            case 1:
                t tVar2 = (t) this.f20486s;
                fl.b bVar2 = (fl.b) obj;
                y1 y1Var2 = tVar2.f20483y;
                p01.p pVar2 = (p01.p) ((g1) y1Var2.getValue()).getData();
                ArrayList arrayList2 = pVar2 != null ? pVar2.a : null;
                tVar2.Q(y1Var2, bVar2, arrayList2 == null || arrayList2.isEmpty());
                break;
            default:
                SimpleRepository simpleRepository = (SimpleRepository) this.f20486s;
                ArrayList arrayList3 = ((p01.p) obj).a;
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    SimpleRepository simpleRepository2 = (SimpleRepository) obj2;
                    arrayList4.add(new b(simpleRepository2, k71.k.b(simpleRepository2.s, simpleRepository != null ? simpleRepository.s : null)));
                }
                return arrayList4;
        }
        return w61.a0.a;
    }
}
