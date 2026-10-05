package com.github.rudroid.settings.codeoptions;

import ad.a;
import androidx.compose.runtime.l1;
import f0.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ k(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        int i = this.r;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                a.g gVar = n.a;
                ((l1) obj2).E(floatValue);
                return w61.a0.a;
            case 1:
                w1.r rVar = (w1.r) obj;
                a.g gVar2 = n.a;
                k71.k.g(rVar, "$this$applyIf");
                return f0.o.w(rVar, (z1) obj2, false);
            default:
                s5.b bVar = (s5.b) obj;
                k71.k.g(bVar, "preferences");
                ((r) obj2).getClass();
                Boolean bool = (Boolean) bVar.d(w.a);
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                Boolean bool2 = (Boolean) bVar.d(w.b);
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Integer num = (Integer) bVar.d(w.c);
                int intValue = num != null ? num.intValue() : 0;
                Boolean bool3 = (Boolean) bVar.d(w.d);
                boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = (Boolean) bVar.d(w.e);
                boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : true;
                Boolean bool5 = (Boolean) bVar.d(w.f);
                return new v(booleanValue, booleanValue2, intValue, booleanValue3, booleanValue4, bool5 != null ? bool5.booleanValue() : true);
        }
    }
}
