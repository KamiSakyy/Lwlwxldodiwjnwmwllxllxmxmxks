package com.github.commonandroid.featureflag;

import ei.c;
import ei.e;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RuntimeFeatureFlag {
    public static final RuntimeFeatureFlag a = new RuntimeFeatureFlag();
    public static e b;

    private RuntimeFeatureFlag() {
    }

    public static boolean a(c cVar) {
        k.g(cVar, "feature");
        e eVar = b;
        if (eVar == null) {
            return cVar.t.r;
        }
        eVar.getClass();
        k.g(cVar, "feature");
        return eVar.a.getBoolean(cVar.r, cVar.t.r);
    }
}
