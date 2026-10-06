package com.github.rudroid.agents.copilothome.navigation;

import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public y1 f6839a;

    /* renamed from: b, reason: collision with root package name */
    public i1 f6840b;

    public j() {
        y1 c10 = n1Shadow.c((Object) null);
        this.f6839a = c10;
        this.f6840b = new i1(c10);
    }

    @Override // com.github.rudroid.agents.copilothome.navigation.d
    public final void a(e eVar) {
        y1 y1Var = this.f6839a;
        y1Var.getClass();
        y1Var.k((Object) null, eVar);
    }

    @Override // com.github.rudroid.agents.copilothome.navigation.d
    public final i1 b() {
        return this.f6840b;
    }

    @Override // com.github.rudroid.agents.copilothome.navigation.d
    public final void c() {
        this.f6839a.j((Object) null);
    }
}
