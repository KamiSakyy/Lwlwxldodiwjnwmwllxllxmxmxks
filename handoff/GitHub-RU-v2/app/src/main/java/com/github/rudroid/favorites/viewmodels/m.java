package com.github.rudroid.favorites.viewmodels;

import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.f;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {
    public static ArrayList a(boolean z10, List list, List list2) {
        k71.k.g(list, "selectedRepositories");
        k71.k.g(list2, "selectableRepositories");
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.add(new f.c(2131952564));
            if (list.isEmpty()) {
                arrayList.add(f.b.f28481c);
            } else {
                ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new f.e((SimpleRepository) it.next()));
                }
                arrayList.addAll(arrayList2);
            }
        }
        if (!list2.isEmpty()) {
            arrayList.add(new f.c(2131952563));
            ArrayList arrayList3 = new ArrayList(x61.n.F(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new f.d((SimpleRepository) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }
}
