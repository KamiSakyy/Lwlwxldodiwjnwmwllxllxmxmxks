package bm;

import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
import java.util.ArrayList;
import yz0.k2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ k71.s s;
    public final /* synthetic */ ArrayList t;

    public /* synthetic */ b(k71.s sVar, ArrayList arrayList, int i) {
        this.r = i;
        this.s = sVar;
        this.t = arrayList;
    }

    public final Object k(Object obj) {
        int i = this.r;
        boolean z = false;
        ArrayList arrayList = this.t;
        k71.s sVar = this.s;
        t tVar = (t) obj;
        switch (i) {
            case 0:
                AssigneeFilter.Companion companion = AssigneeFilter.Companion;
                k71.k.g(tVar, "it");
                if (!k71.k.b(tVar.a, "no:assignee")) {
                    if (k71.k.b(tVar.b, "assignee")) {
                        Object obj2 = tVar.d;
                        if (obj2 instanceof yz0.f) {
                            arrayList.add(obj2);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                sVar.r = true;
                z = true;
                return Boolean.valueOf(z);
            case 1:
                LabelFilter.Companion companion2 = LabelFilter.Companion;
                k71.k.g(tVar, "it");
                if (!k71.k.b(tVar.a, "no:label")) {
                    if (k71.k.b(tVar.b, "label")) {
                        Object obj3 = tVar.d;
                        if (obj3 instanceof k2) {
                            arrayList.add(obj3);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                sVar.r = true;
                z = true;
                return Boolean.valueOf(z);
            default:
                MilestoneFilter.Companion companion3 = MilestoneFilter.Companion;
                k71.k.g(tVar, "it");
                if (!k71.k.b(tVar.a, "no:milestone")) {
                    if (k71.k.b(tVar.b, "milestone")) {
                        Object obj4 = tVar.d;
                        if (obj4 instanceof v2) {
                            arrayList.add(obj4);
                        }
                    }
                    return Boolean.valueOf(z);
                }
                sVar.r = true;
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
