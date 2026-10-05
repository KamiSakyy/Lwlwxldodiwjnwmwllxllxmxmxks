package com.github.rudroid.webview.adapters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final ArrayList a(List list) {
        k.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m.J(arrayList, ((g) it.next()).a());
        }
        return arrayList;
    }
}
