package com.github.rudroid.copilot;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.github.rudroid.utilities.ui.g1 f9416a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9417b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9418c;

    public b(com.github.rudroid.utilities.ui.g1 g1Var, List list, List list2) {
        k71.k.g(g1Var, "chatState");
        k71.k.g(list, "localMessages");
        k71.k.g(list2, "chatSuggestions");
        this.f9416a = g1Var;
        this.f9417b = list;
        this.f9418c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f9416a, bVar.f9416a) && k71.k.b(this.f9417b, bVar.f9417b) && k71.k.b(this.f9418c, bVar.f9418c);
    }

    public final int hashCode() {
        return this.f9418c.hashCode() + f1.e.c(this.f9417b, this.f9416a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatSnapshot(chatState=");
        sb2.append(this.f9416a);
        sb2.append(", localMessages=");
        sb2.append(this.f9417b);
        sb2.append(", chatSuggestions=");
        return x.i.l(sb2, this.f9418c, ")");
    }
}
