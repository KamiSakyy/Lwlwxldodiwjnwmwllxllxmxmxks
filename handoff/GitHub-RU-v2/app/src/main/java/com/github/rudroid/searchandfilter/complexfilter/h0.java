package com.github.rudroid.searchandfilter.complexfilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h0<T> {
    public j71.e a;
    public final y1 b = n1Shadow.c((Object) null);
    public final LinkedHashSet c = new LinkedHashSet();
    public List d = x61.rShadow.r;

    public h0(j71.e eVar) {
        this.a = eVar;
    }

    public final boolean a(Object obj) {
        T t;
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Boolean) this.a.s(t, obj)).booleanValue()) {
                break;
            }
        }
        return t != null;
    }

    public final boolean b(Object obj) {
        T t;
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Boolean) this.a.s(t, obj)).booleanValue()) {
                break;
            }
        }
        return t != null;
    }

    public abstract ArrayList c(List list, List list2);

    public abstract void d(List list);

    public abstract void e(Object obj, boolean z);
}
