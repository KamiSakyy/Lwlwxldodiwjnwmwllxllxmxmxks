package com.github.rudroid.viewmodels.notifications;

import java.util.ArrayList;
import java.util.List;
import yz0.z2;
import yz0.z4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 {
    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((z2) obj).h() instanceof z4)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
