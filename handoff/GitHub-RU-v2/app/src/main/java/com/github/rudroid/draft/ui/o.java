package com.github.rudroid.draft.ui;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {
    public static final a Companion = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final o f12153c = new o(g1.a.c(g1.Companion), i.f12142r);

    /* renamed from: a, reason: collision with root package name */
    public final g1 f12154a;

    /* renamed from: b, reason: collision with root package name */
    public final i f12155b;

    public static final class a {
    }

    public o(g1 g1Var, i iVar) {
        k71.k.g(iVar, "screenState");
        this.f12154a = g1Var;
        this.f12155b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.f12154a, oVar.f12154a) && this.f12155b == oVar.f12155b;
    }

    public final int hashCode() {
        return this.f12155b.hashCode() + (this.f12154a.hashCode() * 31);
    }

    public final String toString() {
        return "DraftIssueUiState(draftIssueState=" + this.f12154a + ", screenState=" + this.f12155b + ")";
    }
}
