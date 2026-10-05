package com.github.rudroid.issueorpullrequest;

import com.github.rudroid.viewmodels.issuesorpullrequests.c6;
import yz0.q8;

/* loaded from: /home/user/work/p/classes.dex */
public final class q1 {
    public static c6 a(m01.b bVar) {
        he.q b10 = bVar != null ? he.r.b(bVar) : null;
        if (b10 == null) {
            return null;
        }
        boolean z10 = bVar.a;
        q8 q8Var = bVar.c;
        String str = q8Var != null ? q8Var.a : null;
        if (str == null) {
            str = "";
        }
        String str2 = q8Var != null ? q8Var.c : null;
        return new c6(z10, b10, str, str2 != null ? str2 : "");
    }
}
