package com.github.rudroid.auth;

import com.github.service.models.ApiFailure;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {
    public static final void a(y1 y1Var, i iVar, Throwable th) {
        k kVar;
        k71.k.g(y1Var, "<this>");
        if (th == null) {
            kVar = new k(iVar, null, null, 6);
        } else {
            kVar = th instanceof ApiFailure ? new k(iVar, (ApiFailure) th, null, 4) : new k(iVar, null, th, 2);
        }
        y1Var.k((Object) null, kVar);
    }
}
