package com.github.rudroid.agents.copilothome.viewmodel;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;
import xn.g4;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {
    public static final a Companion = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final c f6964d = new c(new com.github.rudroid.agents.copilothome.viewmodel.a(g1.a.c(g1.Companion), false), new b(new u0((Object) null), false), null);

    /* renamed from: a, reason: collision with root package name */
    public com.github.rudroid.agents.copilothome.viewmodel.a f6965a;

    /* renamed from: b, reason: collision with root package name */
    public b f6966b;

    /* renamed from: c, reason: collision with root package name */
    public g4 f6967c;

    public static final class a {
    }

    public c(com.github.rudroid.agents.copilothome.viewmodel.a aVar, b bVar, g4 g4Var) {
        this.f6965a = aVar;
        this.f6966b = bVar;
        this.f6967c = g4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.f6965a, cVar.f6965a) && k71.k.b(this.f6966b, cVar.f6966b) && k71.k.b(this.f6967c, cVar.f6967c);
    }

    public final int hashCode() {
        int hashCode = (this.f6966b.hashCode() + (this.f6965a.hashCode() * 31)) * 31;
        g4 g4Var = this.f6967c;
        return hashCode + (g4Var == null ? 0 : g4Var.hashCode());
    }

    public final String toString() {
        return "CopilotHomeUiModel(agentSessionsSection=" + this.f6965a + ", threadsSection=" + this.f6966b + ", copilotPermissions=" + this.f6967c + ")";
    }
}
