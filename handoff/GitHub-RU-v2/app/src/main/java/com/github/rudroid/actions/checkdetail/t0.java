package com.github.rudroid.actions.checkdetail;

import com.github.service.models.response.CheckStatusState;

/* loaded from: /home/user/work/p/classes.dex */
public final class t0 {
    public static final boolean a(mn.a aVar) {
        if ((aVar != null ? aVar.e : null) != CheckStatusState.COMPLETED || aVar.f == null) {
            return x61.m.N(sy.d0.o(new CheckStatusState[]{CheckStatusState.REQUESTED, CheckStatusState.UNKNOWN__}), aVar != null ? aVar.e : null);
        }
        return true;
    }
}
