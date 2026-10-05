package com.github.rudroid.settings.codeoptions;

import ad.a;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class j implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.e s;

    public /* synthetic */ j(int i, j71.e eVar) {
        this.r = i;
        this.s = eVar;
    }

    public final Object k(Object obj) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        j71.e eVar = this.s;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a.g gVar = n.a;
                eVar.s(bool, w.f);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                a.g gVar2 = n.a;
                eVar.s(bool2, w.a);
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                a.g gVar3 = n.a;
                eVar.s(bool3, w.d);
                break;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                a.g gVar4 = n.a;
                eVar.s(bool4, w.b);
                break;
            case 4:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                a.g gVar5 = n.a;
                eVar.s(bool5, w.e);
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                a.g gVar6 = n.a;
                eVar.s(num, w.c);
                break;
        }
        return a0Var;
    }
}
