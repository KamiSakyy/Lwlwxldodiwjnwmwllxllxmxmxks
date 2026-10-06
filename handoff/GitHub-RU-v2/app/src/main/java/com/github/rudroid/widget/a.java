package com.github.rudroid.widget;

import androidx.compose.runtime.s;
import java.util.Locale;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ m6.e t;

    public /* synthetic */ a(String str, m6.e eVar, int i) {
        this.r = i;
        this.s = str;
        this.t = eVar;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                s sVar = (s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    m71.a.d(this.s, (z5.n) null, this.t, 0, sVar, 0, 10);
                } else {
                    sVar.V();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String upperCase = this.s.toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase, "toUpperCase(...)");
                    m71.a.d(upperCase, (z5.n) null, m6.e.a(this.t, k.h, (s3.o) null, new m6.b(500), (m6.c) null, 122), 0, sVar2, 0, 10);
                } else {
                    sVar2.V();
                }
                break;
        }
        return a0.a;
    }
    public Object L(Object p1) { return null; }
    public Object d(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7) { return null; }
    public Object z(Object p1) { return null; }
}
