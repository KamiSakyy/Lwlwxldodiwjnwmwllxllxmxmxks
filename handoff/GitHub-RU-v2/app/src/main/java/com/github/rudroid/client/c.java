package com.github.rudroid.client;

import aa.s0;
import b21.v;
import k71.k;
import y71.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements com.apollographql.apollo.interceptor.b {
    @Override // com.apollographql.apollo.interceptor.b
    public final i a(aa.d dVar, v vVar) {
        k.g(dVar, "request");
        aa.d d10 = dVar.d();
        s0 s0Var = dVar.f625a;
        d10.a("X-APOLLO-OPERATION-NAME", s0Var.name());
        d10.a("X-APOLLO-OPERATION-ID", s0Var.i());
        return vVar.q(d10.b());
    }
}
