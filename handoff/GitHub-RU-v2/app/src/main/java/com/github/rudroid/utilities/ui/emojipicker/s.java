package com.github.rudroid.utilities.ui.emojipicker;

import com.github.rudroid.y;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ y s;
    public final /* synthetic */ j71.c t;

    public s(List list, y yVar, j71.c cVar) {
        this.r = list;
        this.s = yVar;
        this.t = cVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        n0.l lVar = (n0.l) obj;
        int intValue = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(lVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            w61.k kVar = (w61.k) this.r.get(intValue);
            sVar.c0(1154301525);
            String str = (String) kVar.r;
            String str2 = (String) kVar.s;
            y yVar = this.s;
            y yVar2 = y.r;
            j71.c cVar = this.t;
            if (yVar == yVar2) {
                sVar.c0(1154316466);
                t.e(str, cVar, sVar, 0);
                sVar.q(false);
            } else {
                sVar.c0(1154536969);
                t.c(str2, str, cVar, sVar, 0);
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
    public Object N() { return null; }
    public Object e0(Object p1) { return null; }
    public Object g(Object p1) { return null; }
    public Object g0() { return null; }
    public Object h(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object n0(Object p1) { return null; }
    public Object q0() { return null; }
    public Object t() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int p1, boolean p2) { return null; }
    public Object c0(int p1) { return null; }
    public Object d(int p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(boolean p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object j(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(boolean p1) { return null; }
}
